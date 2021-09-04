export default class {
	constructor(el) {
		this.hour = 0;
		this.min = 0;
		this.sec = 0;
        this.mil = 0;
		this.el = el;
	}

	update() {
		this.mil++;

        if (this.mil == 10) {
			this.sec++;
			this.mil = 0;
		}

		if (this.sec == 60) {
			this.sec = 0;
			this.min++;
		}

		if (this.min == 60) {
			this.min = 0;
			this.hour++;
		}
	}

	render() {
		let { el, hour, sec, min, mil } = this;

		el.innerHTML = `
                    <input type="text" value="${String(hour).padStart(2, "0")}" disabled></input>:
					<input type="text" value="${String(min).padStart(2,"0")}" disabled></input>:
					<input type="text" value="${String(sec).padStart(2, "0")}" disabled></input>
                    .
                    ${mil}
        `;
	}

	start() {
		this.timer = setInterval(() => {
			this.update();
			this.render();
		}, 100);
	}

	stop() {
        clearInterval(this.timer);
    }

	record(el) {
		let { hour, sec, min, mil } = this;

		let addRecord = document.createElement('div')
		addRecord.innerHTML = `<p class="record">
		${String(hour).padStart(2, "0")}:
		${String(min).padStart(2,"0")}:
		${String(sec).padStart(2, "0")}.
		${mil}
		</p>`;

		el.appendChild(addRecord);
	}

	reset(el) {
		clearInterval(this.timer);
		this.min =0 ;
		this.mil = 0;
		this.sec = 0;
		this.hour = 0;
		this.render();

		el.innerHTML ="";
	}
}

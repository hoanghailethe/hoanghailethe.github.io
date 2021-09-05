describe("Bài 1 - Test", function () {
    describe("Chu vi hình tròn", function () {
        it("Chu vi hình tròn có bán kính r = 2", function () {
            assert.equal(calcCircumferenceOfCircle(2), 12.56);
        });

        it("Chu vi hình tròn có bán kính r = 3", function () {
            assert.equal(calcCircumferenceOfCircle(3), 18.84);
        });

        it("Chu vi hình tròn có bán kính r = 4", function () {
            assert.equal(calcCircumferenceOfCircle(4), 25.12);
        });
    });

    describe("Diện tích hình tròn", function () {
        it("Diện tích hình tròn có bán kính r = 2", function () {
            assert.equal(calcAreaOfCircle(2), 12.56);
        });

        it("Diện tích hình tròn có bán kính r = 3", function () {
            assert.equal(calcAreaOfCircle(3), 28.26);
        });

        it("Diện tích hình tròn có bán kính r = 4", function () {
            assert.equal(calcAreaOfCircle(4), 50.24);
        });
    });
});

describe("Bài 2 - Test", function () {
    describe("Chu vi hình tam giác", function () {
        it("Chu vi hình tam giác có 3 cạnh a = 3, b = 4, c = 5", function () {
            assert.equal(calcCircumferenceOfTriangle(3, 4, 5), 12);
        });

        it("Chu vi hình tam giác có 3 cạnh a = 6, b = 8, c = 10", function () {
            assert.equal(calcCircumferenceOfTriangle(6, 8, 10), 24);
        });

        it("Chu vi hình tam giác có 3 cạnh a = 5, b = 5, c = 8", function () {
            assert.equal(calcCircumferenceOfTriangle(5, 5, 8), 18);
        });

        it("Chu vi hình tam giác có 3 cạnh a = 17, b = 10, c = 9", function () {
            assert.equal(calcCircumferenceOfTriangle(17, 10, 9), 36);
        });
    });

    describe("Diện tích hình tam giác", function () {
        it("Diện tích hình tam giác có 3 cạnh a = 3, b = 4, c = 5", function () {
            assert.equal(calcAreaOfTriangle(3, 4, 5), 6);
        });

        it("Diện tích hình tam giác có 3 cạnh a = 6, b = 8, c = 10", function () {
            assert.equal(calcAreaOfTriangle(6, 8, 10), 24);
        });

        it("Diện tích hình tam giác có 3 cạnh a = 5, b = 5, c = 8", function () {
            assert.equal(calcAreaOfTriangle(5, 5, 8), 12);
        });

        it("Diện tích hình tam giác có 3 cạnh a = 17, b = 10, c = 9", function () {
            assert.equal(calcAreaOfTriangle(17, 10, 9), 36);
        });
    });
});

describe("Bài 3 - Test", function () {
    describe("Chuyển đổi nhiệt độ từ Celcius sang Fahrenheit", function () {
        it("Chuyển đổi 1°C sang °F", function () {
            assert.equal(convertCelciusToFahrenheit(1), 33.8);
        });

        it("Chuyển đổi 2°C sang °F", function () {
            assert.equal(convertCelciusToFahrenheit(2), 35.6);
        });

        it("Chuyển đổi 100°C sang °F", function () {
            assert.equal(convertCelciusToFahrenheit(100), 212);
        });
    });

    describe("Chuyển đổi nhiệt độ từ Celcius sang Kevin", function () {
        it("Chuyển đổi 1°C sang °K", function () {
            assert.equal(convertCelciusToKevin(1), 274.15);
        });

        it("Chuyển đổi 2°C sang °K", function () {
            assert.equal(convertCelciusToKevin(2), 275.15);
        });

        it("Chuyển đổi 100°C sang °K", function () {
            assert.equal(convertCelciusToKevin(100), 373.15);
        });
    });
});

describe("Bài 4 - Test", function () {
    describe("Kiểm tra số có chia hết cho cả 3 và 5, đồng thời không chia hết cho 2 hay không", function () {
        it("Số 3", function () {
            assert.isFalse(isDivisible(3));
        });

        it("Số 5", function () {
            assert.isFalse(isDivisible(5));
        });

        it("Số 15", function () {
            assert.isTrue(isDivisible(15));
        });

        it("Số 30", function () {
            assert.isFalse(isDivisible(30));
        });
    });
});

describe("Bài 5 - Test", function () {
    describe("Kiểm tra số có nằm trong khoảng 100 - 200 hoặc 400 - 500 không", function () {
        it("Số 1", function () {
            assert.isFalse(isBetween(3));
        });

        it("Số 100", function () {
            assert.isTrue(isBetween(100));
        });

        it("Số 450", function () {
            assert.isTrue(isBetween(450));
        });
    });
});

describe("Bài 6 - Test", function () {
    describe("Kiểm tra một ký tự có thuộc bảng alphabet (a-zA-Z) hay không", function () {
        it("Ký tự 'a'", function () {
            assert.isTrue(isAlphabet("a"));
        });

        it("Ký tự 'Y'", function () {
            assert.isTrue(isAlphabet("Y"));
        });

        it("Ký tự '.'", function () {
            assert.isFalse(isAlphabet("."));
        });
    });
});

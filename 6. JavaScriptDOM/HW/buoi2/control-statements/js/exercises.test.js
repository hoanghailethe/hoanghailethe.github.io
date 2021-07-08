describe("Bài 1 - Test", function () {
    describe("Kiểm tra số lớn nhất trong 3 số", function () {
        it("Số lớn nhất trong 3 số [1, 2, 3]", function () {
            assert.equal(maxOfThree(1, 2, 3), 3);
        });
        it("Số lớn nhất trong 3 số [-1, 2, 0]", function () {
            assert.equal(maxOfThree(-1, 2, 0), 2);
        });
        it("Số lớn nhất trong 3 số [4, 1, 3]", function () {
            assert.equal(maxOfThree(4, 1, 3), 4);
        });
        it("Số lớn nhất trong 3 số [0, 0, 6]", function () {
            assert.equal(maxOfThree(0, 0, 6), 6);
        });
    });
});

describe("Bài 2 - Test", function () {
    describe("Giá trị không hợp lệ", function () {
        it("Nếu month <= 0 hoặc lớn hơn 12, kết quả là NaN", function () {
            assert.isNaN(getSeason(0));
            assert.isNaN(getSeason(13));
        });
    });

    describe("Tính mùa tương ứng", function () {
        it("Mùa tương ứng với tháng 1", function () {
            assert.equal(getSeason(1).trim().toLowerCase(), "spring");
        });
        it("Mùa tương ứng với tháng 3", function () {
            assert.equal(getSeason(3).trim().toLowerCase(), "spring");
        });
        it("Mùa tương ứng với tháng 5", function () {
            assert.equal(getSeason(5).trim().toLowerCase(), "summer");
        });
        it("Mùa tương ứng với tháng 6", function () {
            assert.equal(getSeason(6).trim().toLowerCase(), "summer");
        });
        it("Mùa tương ứng với tháng 7", function () {
            assert.equal(getSeason(7).trim().toLowerCase(), "autumn");
        });
        it("Mùa tương ứng với tháng 9", function () {
            assert.equal(getSeason(9).trim().toLowerCase(), "autumn");
        });
        it("Mùa tương ứng với tháng 11", function () {
            assert.equal(getSeason(11).trim().toLowerCase(), "winter");
        });
        it("Mùa tương ứng với tháng 12", function () {
            assert.equal(getSeason(12).trim().toLowerCase(), "winter");
        });
    });
});

describe("Bài 3 - Test", function () {
    describe("Kiểm tra năm nhuận", function () {
        it("Năm 2000", function () {
            assert.isTrue(isLeapYear(2000));
        });
        it("Năm 2004", function () {
            assert.isTrue(isLeapYear(2004));
        });
        it("Năm 2100", function () {
            assert.isFalse(isLeapYear(2100));
        });
    });
});

describe("Bài 4 - Test", function () {
    describe("Giá trị không hợp lệ", function () {
        it("Nếu point < 0 hoặc lớn hơn 10, kết quả là NaN", function () {
            assert.isNaN(calcGrade(-1));
            assert.isNaN(calcGrade(10.01));
        });
    });

    describe("Quy đổi điểm chữ", function () {
        it("8", function () {
            assert.equal(calcGrade(8), "B");
        });
        it("7.7", function () {
            assert.equal(calcGrade(7.7), "B");
        });
        it("8.8", function () {
            assert.equal(calcGrade(8.8), "A");
        });
        it("3.5", function () {
            assert.equal(calcGrade(3.0), "F");
        });
        it("4", function () {
            assert.equal(calcGrade(4), "D");
        });
        it("6.99", function () {
            assert.equal(calcGrade(6.99), "C");
        });
    });
});

describe("Bài 5 - Test", function () {
    describe("Tìm nghiệm phương trình bậc nhất", function () {
        it("2x + 1 = 0", function () {
            assert.equal(linear(2, 1), -0.5);
        });
        it("2x - 4 = 0", function () {
            assert.equal(linear(2, -4), 2);
        });
        it("1.5x + 0 = 0", function () {
            assert.equal(linear(1.5, 0), 0);
        });
        it("0x + 5 = 0", function () {
            assert.isNull(linear(0, 5));
        });
        it("0x + 0 = 0", function () {
            assert.isNaN(linear(0, 0));
        });
    });
});

describe("Bài 6 - Test", function () {
    describe("Tìm nghiệm phương trình bậc 2", function () {
        it("2x2 - 7x + 3 = 0", function () {
            assert.propertyVal(quadratic(2, -7, 3), "x1", 3);
            assert.propertyVal(quadratic(2, -7, 3), "x2", 0.5);
        });

        it("6x2 + x + 5 = 0", function () {
            assert.isNull(quadratic(6, 1, 5));
        });

        it("x2 - 8x + 16 = 0", function () {
            assert.propertyVal(quadratic(1, -8, 16), "x1", 4);
            assert.propertyVal(quadratic(1, -8, 16), "x2", 4);
        });

        it("0x2 - 2x + 4 = 0", function () {
            assert.equal(quadratic(0, -2, 4), 2);
        });
    });
});

describe("Bài 7 - Test", function () {
    describe("Tính tổng các số chia hết cho 3 và 5 trong khoảng 1 -> n", function () {
        it("n = 10", function () {
            assert.equal(sumMultiple(10), 0);
        });
        it("n = 100", function () {
            assert.equal(sumMultiple(100), 315);
        });
        it("n = 1000", function () {
            assert.equal(sumMultiple(1000), 33165);
        });
        it("n = 1000000", function () {
            assert.equal(sumMultiple(1000000), 33333166665);
        });
    });
});

describe("Bài 8 - Test", function () {
    describe("Kiểm tra số nguyên tố", function () {
        it("n = 0", function () {
            assert.isFalse(isPrime(0));
        });
        it("n = 2", function () {
            assert.isTrue(isPrime(2));
        });
        it("n = 4", function () {
            assert.isFalse(isPrime(4));
        });
        it("n = 5", function () {
            assert.isTrue(isPrime(5));
        });
        it("n = 8", function () {
            assert.isFalse(isPrime(8));
        });
        it("n = 97", function () {
            assert.isTrue(isPrime(97));
        });
    });
});

describe("Bài 9 - Test", function () {
    describe("Tính tổng các số nguyên tố trong khoảng a -> b", function () {
        it("a = 10, b = 100", function () {
            assert.equal(sumPrime(10, 100), 1043);
        });
        it("a = 19, b = 1000", function () {
            assert.equal(sumPrime(19, 1000), 76069);
        });
        it("a = 342, b = 2345", function () {
            assert.equal(sumPrime(342, 2345), 362421);
        });
    });
});

describe("Bài 10 - Test", function () {
    describe("Tính số Fibonacci thứ n", function () {
        it("n = -1", function () {
            assert.isNull(getFibonacci(-1));
        });
        it("n = 0", function () {
            assert.isNull(getFibonacci(0));
        });
        it("n = 1", function () {
            assert.equal(getFibonacci(1), 0);
        });
        it("n = 2", function () {
            assert.equal(getFibonacci(2), 1);
        });
        it("n = 12", function () {
            assert.equal(getFibonacci(12), 89);
        });
        it("n = 30", function () {
            assert.equal(getFibonacci(30), 514229);
        });
        it("n = 50", function () {
            assert.equal(getFibonacci(50), 7778742049);
        });
    });
});

describe("Bài 11 - Test", function () {
    describe("Giá trị không hợp lệ", function () {
        it("n = -1", function () {
            assert.isNaN(factorial(-1));
        });
    });

    describe("Tính giai thừa của một số", function () {
        it("n = 0", function () {
            assert.equal(factorial(0), 1);
        });
        it("n = 4", function () {
            assert.equal(factorial(4), 24);
        });
        it("n = 8", function () {
            assert.equal(factorial(8), 40320);
        });
        it("n = 50", function () {
            assert.equal(factorial(50), 3.0414093201713376e64);
        });
    });
});

describe("Bài 12 - Test", function () {
    describe("Kiểm tra số Strong", function () {
        it("n = -10", function () {
            assert.isFalse(isStrong(-10));
        });
        it("n = 0", function () {
            assert.isFalse(isStrong(0));
        });
        it("n = 1", function () {
            assert.isTrue(isStrong(1));
        });
        it("n = 2", function () {
            assert.isTrue(isStrong(2));
        });
        it("n = 3", function () {
            assert.isFalse(isStrong(3));
        });
        it("n = 140", function () {
            assert.isFalse(isStrong(140));
        });
        it("n = 145", function () {
            assert.isTrue(isStrong(145));
        });
        it("n = 40585", function () {
            assert.isTrue(isStrong(40585));
        });
        it("n = 34432", function () {
            assert.isFalse(isStrong(34432));
        });
    });
});

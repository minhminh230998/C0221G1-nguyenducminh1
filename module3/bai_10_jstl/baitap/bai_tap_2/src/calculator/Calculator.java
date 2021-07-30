package calculator;

public class Calculator {
    public static float calculate(float first, float second, char operator) {
        switch (operator) {
            case '+' :
                return (first + second);
            case '-':
                return (first - second);
            case '*':
                return (first * second);
            case '/':
                if (second != 0) {
                    return (first / second);
                } else {
                    throw new RuntimeException("Chia cho 0?? có đi học chưa");
                }
            default:
                throw new RuntimeException("Phép tính không hợp lệ");
        }
    }

}

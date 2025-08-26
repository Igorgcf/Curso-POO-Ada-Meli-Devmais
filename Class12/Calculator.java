package Class12;

public class Calculator <T extends Number>{

        private T number1;
        private T number2;

        public Calculator(T number1, T number2){
            this.number1 = number1;
            this.number2 = number2;
        }

        public T sum(){

            Double result =  Double.valueOf(number1.doubleValue() + number2.doubleValue());
            return (T) result;
        }

        public T subtraction(){

             Double result = number1.doubleValue() - number2.doubleValue();
                return (T) result;
        }

        public T multiplication(){

            Double result = number1.doubleValue() * number2.doubleValue();
            return (T) result;
        }

        public T division(){

            Double result = number1.doubleValue() / number2.doubleValue();
            return (T) result;
        }
}

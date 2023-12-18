
class CalculatorConundrum {
    public String calculate(int operand1, int operand2, String operation) {
        if(operation==null)
        throw new IllegalArgumentException("Operation cannot be null");
        if(operation.equals(""))
        throw new IllegalArgumentException("Operation cannot be empty");
        int result;
        if(operation.equals("+"))
        {
            result=operand1+operand2;
        } 
        else if(operation.equals("*"))
        {
            result=operand1*operand2;
        }
        else if(operation.equals("/"))
        {
            try {
                result =operand1/operand2;
            } catch (ArithmeticException e) {
                throw new IllegalOperationException("Division by zero is not allowed",e);
            }
        }
        else
        throw new IllegalOperationException("Operation '"+operation+"' does not exist");
        return operand1 +" "+ operation +" "+ operand2 +" = "+result;   
}
}

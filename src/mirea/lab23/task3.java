package mirea.lab23;

interface Expression {
    double evaluate(double x);
}
public class task3 {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Enter an argument and try again");
            return;
        }
        double x = Double.parseDouble(args[0]);

        Expression expression = new Add(
                new Subtract(
                        new Multiply(new Variable("x"), new Variable("x")),
                        new Multiply(new Const(2), new Variable("x"))
                ),
                new Const(1)
        );
        double result = expression.evaluate(x);
        System.out.println("Result: " + result);
    }
}
class Variable implements Expression {
    private final String name;
    public Variable(String name) {
        this.name = name;
    }
    @Override
    public double evaluate(double x) {
        return x;
    }
}
class Subtract implements Expression {
    private final Expression left;
    private final Expression right;
    public Subtract(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }
    @Override
    public double evaluate(double x) {
        return left.evaluate(x) - right.evaluate(x);
    }
}

class Multiply implements Expression {
    private final Expression left;
    private final Expression right;
    public Multiply(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }
    @Override
    public double evaluate(double x) {
        return left.evaluate(x) * right.evaluate(x);
    }
}
class Divide implements Expression {
    private final Expression left;
    private final Expression right;
    public Divide(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }
    @Override
    public double evaluate(double x) {
        return left.evaluate(x) / right.evaluate(x);
    }
}
class Const implements Expression {
    private final double value;
    public Const(double value) {
        this.value = value;
    }
    @Override
    public double evaluate(double x) {
        return value;
    }
}
class Add implements Expression {
    private final Expression left;
    private final Expression right;
    public Add(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }
    @Override
    public double evaluate(double x) {
        return left.evaluate(x) + right.evaluate(x);
    }
}

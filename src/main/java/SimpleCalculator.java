public class SimpleCalculator<T extends Number> {

    private boolean checkIntegerTypes(T first,T second) {
        return first instanceof Integer && second instanceof Integer;
    }

    private boolean checkLongTypes(T first,T second) {
        return first instanceof Long && second instanceof Long;
    }

    private boolean checkDoubleTypes(T first,T second) {
        return first instanceof Double && second instanceof Double;
    }

    private boolean checkFloatTypes(T first,T second) {
        return first instanceof Float && second instanceof Float;
    }

    public T sum(T first, T second) {
        if (checkIntegerTypes(first,second)) {
            return (T) Integer.valueOf(first.intValue() + second.intValue());
        } else if (checkLongTypes(first,second)) {
            return (T) Long.valueOf(first.longValue() + second.longValue());
        } else if (checkDoubleTypes(first,second)) {
            return (T) Double.valueOf(first.doubleValue() + second.doubleValue());
        } else if (checkFloatTypes(first,second)) {
            return (T) Float.valueOf(first.floatValue() + second.floatValue());
        } else {
            return (T) Integer.valueOf(first.intValue() + second.intValue());
        }
    }

    public T sub(T first, T second) {
        if (checkIntegerTypes(first,second)) {
            return (T) Integer.valueOf(first.intValue() - second.intValue());
        } else if (checkLongTypes(first,second)) {
            return (T) Long.valueOf(first.longValue() - second.longValue());
        } else if (checkDoubleTypes(first,second)) {
            return (T) Double.valueOf(first.doubleValue() - second.doubleValue());
        }  else if (checkFloatTypes(first,second)) {
            return (T) Float.valueOf(first.floatValue() - second.floatValue());
        } else {
            return (T) Integer.valueOf(first.intValue() - second.intValue());
        }
    }

    public T mul (T first, T second) {
        if (checkIntegerTypes(first,second)) {
            return (T) Integer.valueOf(first.intValue() * second.intValue());
        } else if (checkLongTypes(first,second)) {
            return (T) Long.valueOf(first.longValue() * second.longValue());
        } else if (checkDoubleTypes(first,second)) {
            return (T) Double.valueOf(first.doubleValue() * second.doubleValue());
        }  else if (checkFloatTypes(first,second)) {
            return (T) Float.valueOf(first.floatValue() * second.floatValue());
        } else {
            return (T) Integer.valueOf(first.intValue() * second.intValue());
        }
    }

    public T div (T first, T second) {
        if (checkIntegerTypes(first,second)) {
            return (T) Integer.valueOf(first.intValue() / second.intValue());
        } else if (checkLongTypes(first,second)) {
            return (T) Long.valueOf(first.longValue() / second.longValue());
        } else if (checkDoubleTypes(first,second)) {
            return (T) Double.valueOf(first.doubleValue() / second.doubleValue());
        }  else if (checkFloatTypes(first,second)) {
            return (T) Float.valueOf(first.floatValue() / second.floatValue());
        } else {
            return (T) Integer.valueOf(first.intValue() / second.intValue());
        }
    }
}



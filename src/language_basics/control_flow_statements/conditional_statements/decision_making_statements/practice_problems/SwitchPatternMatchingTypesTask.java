// package
// src.language_basics.control_flow_statements.conditional_statements.decision_making_statements.practice_problems;

// class TypesOfPatternMatchingSwitch {

// private TypesOfPatternMatchingSwitch() {
// throw new IllegalStateException("Utility class");
// }

// // Task - 1(a)
// static double getDoubleUsingIf(Object o) {
// double result;
// if (o instanceof Integer) {
// result = ((Integer) o).doubleValue();
// } else if (o instanceof Float) {
// result = ((Float) o).doubleValue();
// } else if (o instanceof String) {
// result = Double.parseDouble(((String) o));
// } else {
// result = 0d;
// }
// return result;
// }

// // Task - 1(b)
// static double getDoubleUsingSwitchWithIfElse(Object o) {
// return switch (o) {
// case Integer i -> i.doubleValue();
// case Float f -> f.doubleValue();
// case String s -> Double.parseDouble(s);
// default -> 0d;
// };
// }

// // Task - 2(a)
// static double getDoubleUsingSwitch(Object o) {
// return switch (o) {
// case Integer i -> i.doubleValue();
// case Float f -> f.doubleValue();
// case String s -> {
// if(s.length() > 0) {
// yield Double.parseDouble(s);
// } else {
// yield 0d;
// }
// };
// default -> 0d;
// };
// }

// // Task - 2(b)
// static double getDoubleUsingSwitchWithGuardedPattern(Object o) {
// return switch (o) {
// case Integer i -> i.doubleValue();
// case Float f -> f.doubleValue();
// case String s && s.length() > 0 -> Double.parseDouble(s);
// default -> 0d;
// };
// }

// // Task - 3
// static double getDoubleUsingSwitchWithParanthesizedPattern(Object o) {
// return switch (o) {
// case Integer i -> i.doubleValue();
// case Float f -> f.doubleValue();
// case String s && s.length() > 0 && !(s.contains("#") || s.contains("@")) ->
// Double.parseDouble(s);
// default -> 0d;
// };
// }
// }

// public class SwitchPatternMatchingTypesTask {

// public static void main(String[] args) {
// System.out.println("Demonstrating conversion to double using
// if-statement::");
// System.out.println(TypesOfPatternMatchingSwitch.getDoubleUsingIf(27));
// System.out.println(TypesOfPatternMatchingSwitch.getDoubleUsingIf(27.3f));
// System.out.println(TypesOfPatternMatchingSwitch.getDoubleUsingIf("27"));
// System.out.println();

// System.out.println("Demonstrating conversion to double using type
// pattern::");
// System.out.println(TypesOfPatternMatchingSwitch.getDoubleUsingSwitch(27));
// System.out.println(TypesOfPatternMatchingSwitch.getDoubleUsingSwitch(27.3f));
// System.out.println(TypesOfPatternMatchingSwitch.getDoubleUsingSwitch("27"));
// System.out.println();

// System.out.println("Demonstrating conversion to double using guarded
// pattern::");
// System.out.println(TypesOfPatternMatchingSwitch.getDoubleUsingSwitchWithGuardedPattern(27));
// System.out.println(TypesOfPatternMatchingSwitch.getDoubleUsingSwitchWithGuardedPattern(27.3f));
// System.out.println(TypesOfPatternMatchingSwitch.getDoubleUsingSwitchWithGuardedPattern(""));
// System.out.println(TypesOfPatternMatchingSwitch.getDoubleUsingSwitchWithGuardedPattern("27"));
// System.out.println();

// System.out.println("Demonstrating conversion to double using paranthesized
// pattern::");
// System.out.println(TypesOfPatternMatchingSwitch.getDoubleUsingSwitchWithParanthesizedPattern(27));
// System.out.println(TypesOfPatternMatchingSwitch.getDoubleUsingSwitchWithParanthesizedPattern(27.3f));
// System.out.println(TypesOfPatternMatchingSwitch.getDoubleUsingSwitchWithParanthesizedPattern(""));
// System.out.println(TypesOfPatternMatchingSwitch.getDoubleUsingSwitchWithParanthesizedPattern("27"));
// System.out.println();
// }

// }

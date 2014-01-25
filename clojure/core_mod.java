package clojure;

import clojure.lang.*;

public final class core_mod extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Var const__4;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "rem");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "zero?");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "=");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "pos?");
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "+");
 }
 public core_mod() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object num1, java.lang.Object div2) {
  {
   Object m3 = ((java.lang.Number)clojure.lang.Numbers.remainder(((java.lang.Object)num1), ((java.lang.Object)div2)));
   Object __r2647 = null;
   boolean or__3968__auto__4 = clojure.lang.Numbers.isZero(((java.lang.Object)m3));
   Object __r2648;
   if (or__3968__auto__4) {
    __r2648 = or__3968__auto__4;
   } else {
    __r2648 = clojure.lang.Util.equiv((boolean)clojure.lang.Numbers.isPos(((java.lang.Object)num1)), (boolean)clojure.lang.Numbers.isPos(((java.lang.Object)div2)));
   }
   if ((java.lang.Boolean)__r2648) {
    return m3;
   } else {
    return ((java.lang.Number)clojure.lang.Numbers.add(((java.lang.Object)m3), ((java.lang.Object)div2)));
   }
  }
 }
}

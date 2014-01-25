package clojure;

import clojure.lang.*;

public final class pprint_base_str_fn__7687 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final java.lang.Object const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Var const__4;
 public static final java.lang.Object const__5;
 public static final java.lang.Object const__6;
 public static final clojure.lang.Var const__7;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "<");
  const__1 = (java.lang.Object)10L;
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "char");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "+");
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "int");
  const__5 = (java.lang.Object)Character.valueOf((char)48);
  const__6 = (java.lang.Object)Character.valueOf((char)97);
  const__7 = (clojure.lang.Var)RT.var("clojure.core", "-");
 }
 public pprint_base_str_fn__7687() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object p1__7686_SHARP_1) {
  if (clojure.lang.Numbers.lt(((java.lang.Object)p1__7686_SHARP_1), (long)10L)) {
   return Character.valueOf(clojure.lang.RT.charCast(((java.lang.Object)((java.lang.Number)clojure.lang.Numbers.add((long)clojure.lang.RT.intCast(((java.lang.Object)const__5)), ((java.lang.Object)p1__7686_SHARP_1))))));
  } else {
   return Character.valueOf(clojure.lang.RT.charCast(((java.lang.Object)((java.lang.Number)clojure.lang.Numbers.add((long)clojure.lang.RT.intCast(((java.lang.Object)const__6)), ((java.lang.Object)((java.lang.Number)clojure.lang.Numbers.minus(((java.lang.Object)p1__7686_SHARP_1), (long)10L))))))));
  }
 }
}

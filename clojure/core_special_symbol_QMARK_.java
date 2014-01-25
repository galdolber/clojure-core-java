package clojure;

import clojure.lang.*;

public final class core_special_symbol_QMARK_ extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "contains?");
 }
 public core_special_symbol_QMARK_() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object s1) {
  return ((IFn)const__0.getRawRoot()).invoke(((clojure.lang.IPersistentMap)clojure.lang.Compiler.specials), s1);
 }
}

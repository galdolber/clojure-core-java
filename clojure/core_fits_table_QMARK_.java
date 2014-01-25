package clojure;

import clojure.lang.*;

public final class core_fits_table_QMARK_ extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Var const__4;
 public static final clojure.lang.Var const__5;
 public static final clojure.lang.Var const__6;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "<");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "-");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "apply");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "max");
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "seq");
  const__5 = (clojure.lang.Var)RT.var("clojure.core", "min");
  const__6 = (clojure.lang.Var)RT.var("clojure.core", "max-switch-table-size");
 }
 public core_fits_table_QMARK_() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object ints1) {
  return (clojure.lang.Numbers.lt(((java.lang.Object)((java.lang.Number)clojure.lang.Numbers.minus(((java.lang.Object)((IFn)const__2.getRawRoot()).invoke(const__3.getRawRoot(), ((IFn)const__4.getRawRoot()).invoke(ints1))), ((java.lang.Object)((IFn)const__2.getRawRoot()).invoke(const__5.getRawRoot(), ((IFn)const__4.getRawRoot()).invoke(ints1)))))), ((java.lang.Object)const__6.getRawRoot())) ? Boolean.TRUE : Boolean.FALSE);
 }
}

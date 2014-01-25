package clojure;

import clojure.lang.*;

public final class pprint_group_by_STAR_ extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "reverse");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "first");
  const__2 = (clojure.lang.Var)RT.var("clojure.pprint", "consume");
 }
 public pprint_group_by_STAR_() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object unit1, java.lang.Object lis2) {
  return ((IFn)const__0.getRawRoot()).invoke(((IFn)const__1.getRawRoot()).invoke(((IFn)const__2.getRawRoot()).invoke(new clojure.pprint_group_by_STAR__fn__7693(unit1), ((IFn)const__0.getRawRoot()).invoke(lis2))));
 }
}

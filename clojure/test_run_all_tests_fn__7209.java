package clojure;

import clojure.lang.*;

public final class test_run_all_tests_fn__7209 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "re-matches");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "name");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "ns-name");
 }
 Object re1;
 public test_run_all_tests_fn__7209(final Object re1) {
  super();
  this.re1 = re1;
 }
 public java.lang.Object invoke(java.lang.Object p1__7208_SHARP_1) {
  return ((IFn)const__0.getRawRoot()).invoke(this.re1, ((IFn)const__1.getRawRoot()).invoke(((IFn)const__2.getRawRoot()).invoke(p1__7208_SHARP_1)));
 }
}

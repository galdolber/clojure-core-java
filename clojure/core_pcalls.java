package clojure;

import clojure.lang.*;

public final class core_pcalls extends clojure.lang.RestFn {
 public static final clojure.lang.Var const__0;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "pmap");
 }
 public core_pcalls() {
  super();
 }
 public java.lang.Object doInvoke(java.lang.Object fns1) {
  return ((IFn)const__0.getRawRoot()).invoke(new clojure.core_pcalls_fn__6353(), fns1);
 }
 public int getRequiredArity() {
  return 0;
 }
}

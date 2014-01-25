package clojure;

import clojure.lang.*;

public final class test_fn__7177 extends clojure.lang.RestFn {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Keyword const__1;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.test", "add-ns-meta");
  const__1 = (clojure.lang.Keyword)Keyword.intern("clojure.test", "each-fixtures");
 }
 public test_fn__7177() {
  super();
 }
 public java.lang.Object doInvoke(java.lang.Object fixture_type1, java.lang.Object args2) {
  return ((IFn)const__0.getRawRoot()).invoke(const__1, args2);
 }
 public int getRequiredArity() {
  return 1;
 }
}

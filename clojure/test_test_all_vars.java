package clojure;

import clojure.lang.*;

public final class test_test_all_vars extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Keyword const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Keyword const__3;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.test", "join-fixtures");
  const__1 = (clojure.lang.Keyword)Keyword.intern("clojure.test", "once-fixtures");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "meta");
  const__3 = (clojure.lang.Keyword)Keyword.intern("clojure.test", "each-fixtures");
 }
 public test_test_all_vars() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object ns1) {
  {
   Object once_fixture_fn2 = ((IFn)const__0.getRawRoot()).invoke(RT.get(((IFn)const__2.getRawRoot()).invoke(ns1), Keyword.intern("clojure.test", "once-fixtures")));
   Object each_fixture_fn3 = ((IFn)const__0.getRawRoot()).invoke(RT.get(((IFn)const__2.getRawRoot()).invoke(ns1), Keyword.intern("clojure.test", "each-fixtures")));
   return ((IFn)once_fixture_fn2).invoke(new clojure.test_test_all_vars_fn__7192(each_fixture_fn3, ns1));
  }
 }
}

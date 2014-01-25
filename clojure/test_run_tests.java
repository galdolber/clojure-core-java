package clojure;

import clojure.lang.*;

public final class test_run_tests extends clojure.lang.RestFn {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Var const__4;
 public static final clojure.lang.Var const__5;
 public static final clojure.lang.Var const__6;
 public static final clojure.lang.Var const__7;
 public static final clojure.lang.Keyword const__8;
 public static final clojure.lang.Keyword const__9;
 public static final clojure.lang.Var const__10;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.test", "run-tests");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "*ns*");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "assoc");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "apply");
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "merge-with");
  const__5 = (clojure.lang.Var)RT.var("clojure.core", "+");
  const__6 = (clojure.lang.Var)RT.var("clojure.core", "map");
  const__7 = (clojure.lang.Var)RT.var("clojure.test", "test-ns");
  const__8 = (clojure.lang.Keyword)Keyword.intern(null, "type");
  const__9 = (clojure.lang.Keyword)Keyword.intern(null, "summary");
  const__10 = (clojure.lang.Var)RT.var("clojure.test", "do-report");
 }
 public test_run_tests() {
  super();
 }
 public java.lang.Object doInvoke(java.lang.Object namespaces1) {
  {
   Object summary2 = ((IFn)const__2.getRawRoot()).invoke(((IFn)const__3.getRawRoot()).invoke(const__4.getRawRoot(), const__5.getRawRoot(), ((IFn)const__6.getRawRoot()).invoke(const__7.getRawRoot(), namespaces1)), const__8, const__9);
   ((IFn)const__10.getRawRoot()).invoke(summary2);
   return summary2;
  }
 }
 public java.lang.Object invoke() {
  return ((IFn)const__0.getRawRoot()).invoke(const__1.get());
 }
 public int getRequiredArity() {
  return 0;
 }
}

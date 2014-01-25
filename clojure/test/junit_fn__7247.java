package clojure.test;

import clojure.lang.*;

public final class junit_fn__7247 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Symbol const__4;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "commute");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "deref");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "*loaded-libs*");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "conj");
  const__4 = (clojure.lang.Symbol)((clojure.lang.IObj)Symbol.intern(null, "clojure.test.junit")).withMeta((IPersistentMap)RT.map(Keyword.intern(null, "author"), "Jason Sankey", Keyword.intern(null, "doc"), "clojure.test extension for JUnit-compatible XML output.\n\n  JUnit (http://junit.org/) is the most popular unit-testing library\n  for Java.  As such, tool support for JUnit output formats is\n  common.  By producing compatible output from tests, this tool\n  support can be exploited.\n\n  To use, wrap any calls to clojure.test/run-tests in the\n  with-junit-output macro, like this:\n\n    (use 'clojure.test)\n    (use 'clojure.test.junit)\n\n    (with-junit-output\n      (run-tests 'my.cool.library))\n\n  To write the output to a file, rebind clojure.test/*test-out* to\n  your own PrintWriter (perhaps opened using\n  clojure.java.io/writer)."));
 }
 public junit_fn__7247() {
  super();
 }
 public java.lang.Object invoke() {
  return ((IFn)const__0.getRawRoot()).invoke(((IFn)const__1.getRawRoot()).invoke(const__2), const__3.getRawRoot(), const__4);
 }
}

package clojure.test;

import clojure.lang.*;

public final class tap_fn__7215 extends clojure.lang.AFunction {
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
  const__4 = (clojure.lang.Symbol)((clojure.lang.IObj)Symbol.intern(null, "clojure.test.tap")).withMeta((IPersistentMap)RT.map(Keyword.intern(null, "author"), "Stuart Sierra", Keyword.intern(null, "doc"), "clojure.test extensions for the Test Anything Protocol (TAP)\n\n  TAP is a simple text-based syntax for reporting test results.  TAP\n  was originally developed for Perl, and now has implementations in\n  several languages.  For more information on TAP, see\n  http://testanything.org/ and\n  http://search.cpan.org/~petdance/TAP-1.0.0/TAP.pm\n\n  To use this library, wrap any calls to\n  clojure.test/run-tests in the with-tap-output macro,\n  like this:\n\n    (use 'clojure.test)\n    (use 'clojure.test.tap)\n\n    (with-tap-output\n     (run-tests 'my.cool.library))"));
 }
 public tap_fn__7215() {
  super();
 }
 public java.lang.Object invoke() {
  return ((IFn)const__0.getRawRoot()).invoke(((IFn)const__1.getRawRoot()).invoke(const__2), const__3.getRawRoot(), const__4);
 }
}

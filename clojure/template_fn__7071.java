package clojure;

import clojure.lang.*;

public final class template_fn__7071 extends clojure.lang.AFunction {
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
  const__4 = (clojure.lang.Symbol)((clojure.lang.IObj)Symbol.intern(null, "clojure.template")).withMeta((IPersistentMap)RT.map(Keyword.intern(null, "author"), "Stuart Sierra", Keyword.intern(null, "doc"), "Macros that expand to repeated copies of a template expression."));
 }
 public template_fn__7071() {
  super();
 }
 public java.lang.Object invoke() {
  return ((IFn)const__0.getRawRoot()).invoke(((IFn)const__1.getRawRoot()).invoke(const__2), const__3.getRawRoot(), const__4);
 }
}

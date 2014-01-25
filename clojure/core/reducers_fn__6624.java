package clojure.core;

import clojure.lang.*;

public final class reducers_fn__6624 extends clojure.lang.AFunction {
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
  const__4 = (clojure.lang.Symbol)((clojure.lang.IObj)Symbol.intern(null, "clojure.core.reducers")).withMeta((IPersistentMap)RT.map(Keyword.intern(null, "author"), "Rich Hickey", Keyword.intern(null, "doc"), "A library for reduction and parallel folding. Alpha and subject\n      to change.  Note that fold and its derivatives require Java 7+ or\n      Java 6 + jsr166y.jar for fork/join support. See Clojure's pom.xml for the\n      dependency info."));
 }
 public reducers_fn__6624() {
  super();
 }
 public java.lang.Object invoke() {
  return ((IFn)const__0.getRawRoot()).invoke(((IFn)const__1.getRawRoot()).invoke(const__2), const__3.getRawRoot(), const__4);
 }
}

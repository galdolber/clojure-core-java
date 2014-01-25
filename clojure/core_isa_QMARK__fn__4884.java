package clojure;

import clojure.lang.*;

public final class core_isa_QMARK__fn__4884 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Keyword const__1;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "contains?");
  const__1 = (clojure.lang.Keyword)Keyword.intern(null, "ancestors");
 }
 Object parent3;
 Object h1;
 public core_isa_QMARK__fn__4884(final Object parent3, final Object h1) {
  super();
  this.parent3 = parent3;
  this.h1 = h1;
 }
 public java.lang.Object invoke(java.lang.Object p1__4883_SHARP_1) {
  return ((IFn)const__0.getRawRoot()).invoke(((IFn)RT.get(this.h1, Keyword.intern(null, "ancestors"))).invoke(p1__4883_SHARP_1), this.parent3);
 }
}

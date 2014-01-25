package clojure;

import clojure.lang.*;

public final class core_emit_defrecord_imap__5844_fn__5850 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Symbol const__2;
 public static final clojure.lang.Var const__3;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "keyword");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "list*");
  const__2 = (clojure.lang.Symbol)Symbol.intern(null, "new");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "replace");
 }
 Object tagname1;
 Object fields13;
 Object gs15;
 public core_emit_defrecord_imap__5844_fn__5850(final Object tagname1, final Object fields13, final Object gs15) {
  super();
  this.tagname1 = tagname1;
  this.fields13 = fields13;
  this.gs15 = gs15;
 }
 public java.lang.Object invoke(java.lang.Object fld1) {
  return RT.vector(((IFn)const__0.getRawRoot()).invoke(fld1), ((IFn)const__1.getRawRoot()).invoke(const__2, this.tagname1, ((IFn)const__3.getRawRoot()).invoke(RT.mapUniqueKeys(fld1, this.gs15), this.fields13)));
 }
}

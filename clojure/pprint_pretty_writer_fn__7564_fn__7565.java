package clojure;

import clojure.lang.*;

public final class pprint_pretty_writer_fn__7564_fn__7565 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Keyword const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Var const__4;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.pprint", "write-tokens");
  const__1 = (clojure.lang.Keyword)Keyword.intern(null, "buffer");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "deref");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "alter");
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "assoc");
 }
 Object this1;
 public pprint_pretty_writer_fn__7564_fn__7565(final Object this1) {
  super();
  this.this1 = this1;
 }
 public java.lang.Object invoke() {
  ((IFn)const__0.getRawRoot()).invoke(this.this1, RT.get(((IFn)const__2.getRawRoot()).invoke(((IFn)const__2.getRawRoot()).invoke(this.this1)), Keyword.intern(null, "buffer")), Boolean.TRUE);
  return ((IFn)const__3.getRawRoot()).invoke(((IFn)const__2.getRawRoot()).invoke(this.this1), const__4.getRawRoot(), const__1, clojure.lang.PersistentVector.EMPTY);
 }
}

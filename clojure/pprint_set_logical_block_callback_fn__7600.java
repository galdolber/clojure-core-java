package clojure;

import clojure.lang.*;

public final class pprint_set_logical_block_callback_fn__7600 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Keyword const__3;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "alter");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "deref");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "assoc");
  const__3 = (clojure.lang.Keyword)Keyword.intern(null, "logical-block-callback");
 }
 Object this1;
 Object f2;
 public pprint_set_logical_block_callback_fn__7600(final Object this1, final Object f2) {
  super();
  this.this1 = this1;
  this.f2 = f2;
 }
 public java.lang.Object invoke() {
  return ((IFn)const__0.getRawRoot()).invoke(((IFn)const__1.getRawRoot()).invoke(this.this1), const__2.getRawRoot(), const__3, this.f2);
 }
}

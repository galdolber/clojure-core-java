package clojure;

import clojure.lang.*;

public final class pprint_set_miser_width_fn__7597 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Keyword const__3;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "alter");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "deref");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "assoc");
  const__3 = (clojure.lang.Keyword)Keyword.intern(null, "miser-width");
 }
 Object new_miser_width2;
 Object this1;
 public pprint_set_miser_width_fn__7597(final Object new_miser_width2, final Object this1) {
  super();
  this.new_miser_width2 = new_miser_width2;
  this.this1 = this1;
 }
 public java.lang.Object invoke() {
  return ((IFn)const__0.getRawRoot()).invoke(((IFn)const__1.getRawRoot()).invoke(this.this1), const__2.getRawRoot(), const__3, this.new_miser_width2);
 }
}

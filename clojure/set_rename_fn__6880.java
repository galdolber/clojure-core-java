package clojure;

import clojure.lang.*;

public final class set_rename_fn__6880 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.set", "rename-keys");
 }
 Object kmap2;
 public set_rename_fn__6880(final Object kmap2) {
  super();
  this.kmap2 = kmap2;
 }
 public java.lang.Object invoke(java.lang.Object p1__6879_SHARP_1) {
  return ((IFn)const__0.getRawRoot()).invoke(p1__6879_SHARP_1, this.kmap2);
 }
}

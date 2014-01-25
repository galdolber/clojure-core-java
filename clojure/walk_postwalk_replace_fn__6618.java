package clojure;

import clojure.lang.*;

public final class walk_postwalk_replace_fn__6618 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "contains?");
 }
 Object smap1;
 public walk_postwalk_replace_fn__6618(final Object smap1) {
  super();
  this.smap1 = smap1;
 }
 public java.lang.Object invoke(java.lang.Object x1) {
  Object __r4363 = ((IFn)const__0.getRawRoot()).invoke(this.smap1, x1);
  if (__r4363 != null && !(__r4363 == Boolean.FALSE)) {
   return ((IFn)this.smap1).invoke(x1);
  } else {
   return x1;
  }
 }
}

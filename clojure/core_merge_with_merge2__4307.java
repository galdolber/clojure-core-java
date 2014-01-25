package clojure;

import clojure.lang.*;

public final class core_merge_with_merge2__4307 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "reduce1");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "seq");
 }
 Object merge_entry3;
 public core_merge_with_merge2__4307(final Object merge_entry3) {
  super();
  this.merge_entry3 = merge_entry3;
 }
 public java.lang.Object invoke(java.lang.Object m11, java.lang.Object m22) {
  Object __r2540 = null;
  {
   Object or__3968__auto__3 = m11;
   Object __r2541;
   Object __r2542 = or__3968__auto__3;
   if (__r2542 != null && !(__r2542 == Boolean.FALSE)) {
    __r2541 = or__3968__auto__3;
   } else {
    __r2541 = clojure.lang.PersistentArrayMap.EMPTY;
   }
   __r2540 = __r2541;
  }
  return ((IFn)const__0.getRawRoot()).invoke(this.merge_entry3, __r2540, ((IFn)const__1.getRawRoot()).invoke(m22));
 }
}

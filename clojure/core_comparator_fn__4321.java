package clojure;

import clojure.lang.*;

public final class core_comparator_fn__4321 extends clojure.lang.AFunction {
 public static final java.lang.Object const__0;
 public static final java.lang.Object const__1;
 public static final clojure.lang.Keyword const__2;
 public static final java.lang.Object const__3;
 static {
  const__0 = (java.lang.Object)(-1L);
  const__1 = (java.lang.Object)1L;
  const__2 = (clojure.lang.Keyword)Keyword.intern(null, "else");
  const__3 = (java.lang.Object)0L;
 }
 Object pred1;
 public core_comparator_fn__4321(final Object pred1) {
  super();
  this.pred1 = pred1;
 }
 public java.lang.Object invoke(java.lang.Object x1, java.lang.Object y2) {
  Object __r2553 = ((IFn)this.pred1).invoke(x1, y2);
  if (__r2553 != null && !(__r2553 == Boolean.FALSE)) {
   return const__0;
  } else {
   Object __r2555 = ((IFn)this.pred1).invoke(y2, x1);
   if (__r2555 != null && !(__r2555 == Boolean.FALSE)) {
    return const__1;
   } else {
    Object __r2557 = const__2;
    if (__r2557 != null && !(__r2557 == Boolean.FALSE)) {
     return const__3;
    } else {
     return null;
    }
   }
  }
 }
}

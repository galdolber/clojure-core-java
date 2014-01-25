package clojure;

import clojure.lang.*;

public final class core_mk_bound_fn_fn__4720 extends clojure.lang.AFunction {
 public static final java.lang.Object const__0;
 static {
  const__0 = (java.lang.Object)0L;
 }
 Object test2;
 Object key3;
 Object sc1;
 public core_mk_bound_fn_fn__4720(final Object test2, final Object key3, final Object sc1) {
  super();
  this.test2 = test2;
  this.key3 = key3;
  this.sc1 = sc1;
 }
 public java.lang.Object invoke(java.lang.Object e1) {
  return ((IFn)this.test2).invoke(Integer.valueOf(((java.util.Comparator)((java.util.Comparator)((clojure.lang.Sorted)this.sc1).comparator())).compare(((java.lang.Object)((java.lang.Object)((clojure.lang.Sorted)this.sc1).entryKey(((java.lang.Object)e1)))), ((java.lang.Object)this.key3))), const__0);
 }
}

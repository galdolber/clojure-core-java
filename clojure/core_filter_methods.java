package clojure;

import clojure.lang.*;

public final class core_filter_methods extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final java.lang.Object const__1;
 public static final java.lang.Object const__2;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "nth");
  const__1 = (java.lang.Object)0L;
  const__2 = (java.lang.Object)1L;
 }
 public core_filter_methods() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object c1, java.lang.Object invalid_method_QMARK_2) {
  {
   Object mm3 = clojure.lang.PersistentArrayMap.EMPTY;
   Object considered4 = clojure.lang.PersistentHashSet.EMPTY;
   Object c5 = c1;
   while(true) {
    Object __r3502 = c5;
    if (__r3502 != null && !(__r3502 == Boolean.FALSE)) {
     {
      Object vec__55006 = ((IFn)new clojure.core_filter_methods_fn__5501(mm3, c5, considered4, invalid_method_QMARK_2)).invoke();
      Object mm7 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__55006), (int)RT.intCast(0L), ((java.lang.Object)null)));
      Object considered8 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__55006), (int)RT.intCast(1L), ((java.lang.Object)null)));
      java.lang.Object mm3___aux = mm7;
      java.lang.Object considered4___aux = considered8;
      java.lang.Object c5___aux = ((java.lang.Class)((java.lang.Class)c5).getSuperclass());
      mm3 = mm3___aux;
      considered4 = considered4___aux;
      c5 = c5___aux;
      continue;
     }
    } else {
     return mm3;
    }
   }
  }
 }
}

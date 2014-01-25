package clojure;

import clojure.lang.*;

public final class core_generate_proxy_fn__5234 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final java.lang.Object const__1;
 public static final java.lang.Object const__2;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "nth");
  const__1 = (java.lang.Object)0L;
  const__2 = (java.lang.Object)1L;
 }
 Object super1;
 public core_generate_proxy_fn__5234(final Object super1) {
  super();
  this.super1 = super1;
 }
 public java.lang.Object invoke() {
  {
   Object mm1 = clojure.lang.PersistentArrayMap.EMPTY;
   Object considered2 = clojure.lang.PersistentHashSet.EMPTY;
   Object c3 = this.super1;
   while(true) {
    Object __r3340 = c3;
    if (__r3340 != null && !(__r3340 == Boolean.FALSE)) {
     {
      Object vec__52354 = ((IFn)new clojure.core_generate_proxy_fn__5234_fn__5236(mm1, c3, considered2)).invoke();
      Object mm5 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__52354), (int)RT.intCast(0L), ((java.lang.Object)null)));
      Object considered6 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__52354), (int)RT.intCast(1L), ((java.lang.Object)null)));
      java.lang.Object mm1___aux = mm5;
      java.lang.Object considered2___aux = considered6;
      java.lang.Object c3___aux = ((java.lang.Class)((java.lang.Class)c3).getSuperclass());
      mm1 = mm1___aux;
      considered2 = considered2___aux;
      c3 = c3___aux;
      continue;
     }
    } else {
     return RT.vector(mm1, considered2);
    }
   }
  }
 }
}

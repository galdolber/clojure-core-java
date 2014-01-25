package clojure;

import clojure.lang.*;

public final class core_protected_final_methods_not_exposable_QMARK___5512 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "not");
 }
 public core_protected_final_methods_not_exposable_QMARK___5512() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object meth1) {
  {
   int mods2 = ((java.lang.reflect.Method)meth1).getModifiers();
   Object __r3509 = null;
   {
    boolean and__3966__auto__3 = java.lang.reflect.Modifier.isProtected((int)mods2);
    Object __r3510;
    if (and__3966__auto__3) {
     Object __r3511 = null;
     {
      boolean and__3966__auto__4 = java.lang.reflect.Modifier.isFinal((int)mods2);
      Object __r3512;
      if (and__3966__auto__4) {
       __r3512 = ((IFn)const__0.getRawRoot()).invoke((java.lang.reflect.Modifier.isStatic((int)mods2) ? Boolean.TRUE : Boolean.FALSE));
      } else {
       __r3512 = (and__3966__auto__4 ? Boolean.TRUE : Boolean.FALSE);
      }
      __r3511 = __r3512;
     }
     __r3510 = __r3511;
    } else {
     __r3510 = (and__3966__auto__3 ? Boolean.TRUE : Boolean.FALSE);
    }
    __r3509 = __r3510;
   }
   return ((IFn)const__0.getRawRoot()).invoke(__r3509);
  }
 }
}

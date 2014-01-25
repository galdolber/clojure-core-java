package clojure;

import clojure.lang.*;

public final class core_non_private_methods_not_overridable_QMARK___5505 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "not");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "=");
 }
 public core_non_private_methods_not_overridable_QMARK___5505() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object meth1) {
  {
   int mods2 = ((java.lang.reflect.Method)meth1).getModifiers();
   {
    Object __r3503 = null;
    {
     boolean or__3968__auto__3 = java.lang.reflect.Modifier.isPublic((int)mods2);
     Object __r3504;
     if (or__3968__auto__3) {
      __r3504 = (or__3968__auto__3 ? Boolean.TRUE : Boolean.FALSE);
     } else {
      __r3504 = (java.lang.reflect.Modifier.isProtected((int)mods2) ? Boolean.TRUE : Boolean.FALSE);
     }
     __r3503 = (java.lang.Boolean)__r3504;
    }
    Object or__3968__auto__4 = ((IFn)const__0.getRawRoot()).invoke(__r3503);
    Object __r3506 = or__3968__auto__4;
    if (__r3506 != null && !(__r3506 == Boolean.FALSE)) {
     return or__3968__auto__4;
    } else {
     {
      boolean or__3968__auto__5 = java.lang.reflect.Modifier.isStatic((int)mods2);
      if (or__3968__auto__5) {
       return (or__3968__auto__5 ? Boolean.TRUE : Boolean.FALSE);
      } else {
       {
        boolean or__3968__auto__6 = java.lang.reflect.Modifier.isFinal((int)mods2);
        if (or__3968__auto__6) {
         return (or__3968__auto__6 ? Boolean.TRUE : Boolean.FALSE);
        } else {
         return (clojure.lang.Util.equiv(((java.lang.Object)"finalize"), ((java.lang.Object)((java.lang.String)((java.lang.reflect.Method)meth1).getName()))) ? Boolean.TRUE : Boolean.FALSE);
        }
       }
      }
     }
    }
   }
  }
 }
}

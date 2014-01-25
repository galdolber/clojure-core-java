package clojure;

import clojure.lang.*;

public final class core_generate_proxy_fn__5234_fn__5236 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Var const__4;
 public static final clojure.lang.Var const__5;
 public static final clojure.lang.Var const__6;
 public static final clojure.lang.Var const__7;
 public static final clojure.lang.Var const__8;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "concat");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "seq");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "first");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "method-sig");
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "not");
  const__5 = (clojure.lang.Var)RT.var("clojure.core", "=");
  const__6 = (clojure.lang.Var)RT.var("clojure.core", "conj");
  const__7 = (clojure.lang.Var)RT.var("clojure.core", "next");
  const__8 = (clojure.lang.Var)RT.var("clojure.core", "assoc");
 }
 Object mm1;
 Object c3;
 Object considered2;
 public core_generate_proxy_fn__5234_fn__5236(final Object mm1, final Object c3, final Object considered2) {
  super();
  this.mm1 = mm1;
  this.c3 = c3;
  this.considered2 = considered2;
 }
 public java.lang.Object invoke() {
  {
   Object mm1 = this.mm1;
   Object considered2 = this.considered2;
   Object meths3 = ((IFn)const__0.getRawRoot()).invoke(((IFn)const__1.getRawRoot()).invoke(((java.lang.reflect.Method[])((java.lang.Class)this.c3).getDeclaredMethods())), ((IFn)const__1.getRawRoot()).invoke(((java.lang.reflect.Method[])((java.lang.Class)this.c3).getMethods())));
   while(true) {
    Object __r3324 = ((IFn)const__1.getRawRoot()).invoke(meths3);
    if (__r3324 != null && !(__r3324 == Boolean.FALSE)) {
     {
      Object meth4 = ((IFn)const__2.getRawRoot()).invoke(meths3);
      int mods5 = ((java.lang.reflect.Method)meth4).getModifiers();
      Object mk6 = ((IFn)const__3.getRawRoot()).invoke(meth4);
      Object __r3326 = null;
      {
       Object or__3968__auto__7 = ((IFn)considered2).invoke(mk6);
       Object __r3327;
       Object __r3328 = or__3968__auto__7;
       if (__r3328 != null && !(__r3328 == Boolean.FALSE)) {
        __r3327 = or__3968__auto__7;
       } else {
        Object __r3329 = null;
        {
         Object __r3330 = null;
         {
          boolean or__3968__auto__8 = java.lang.reflect.Modifier.isPublic((int)mods5);
          Object __r3331;
          if (or__3968__auto__8) {
           __r3331 = (or__3968__auto__8 ? Boolean.TRUE : Boolean.FALSE);
          } else {
           __r3331 = (java.lang.reflect.Modifier.isProtected((int)mods5) ? Boolean.TRUE : Boolean.FALSE);
          }
          __r3330 = (java.lang.Boolean)__r3331;
         }
         Object or__3968__auto__9 = ((IFn)const__4.getRawRoot()).invoke(__r3330);
         Object __r3332;
         Object __r3333 = or__3968__auto__9;
         if (__r3333 != null && !(__r3333 == Boolean.FALSE)) {
          __r3332 = or__3968__auto__9;
         } else {
          Object __r3334 = null;
          {
           boolean or__3968__auto__10 = java.lang.reflect.Modifier.isStatic((int)mods5);
           Object __r3335;
           if (or__3968__auto__10) {
            __r3335 = (or__3968__auto__10 ? Boolean.TRUE : Boolean.FALSE);
           } else {
            Object __r3336 = null;
            {
             boolean or__3968__auto__11 = java.lang.reflect.Modifier.isFinal((int)mods5);
             Object __r3337;
             if (or__3968__auto__11) {
              __r3337 = (or__3968__auto__11 ? Boolean.TRUE : Boolean.FALSE);
             } else {
              __r3337 = (clojure.lang.Util.equiv(((java.lang.Object)"finalize"), ((java.lang.Object)((java.lang.String)((java.lang.reflect.Method)meth4).getName()))) ? Boolean.TRUE : Boolean.FALSE);
             }
             __r3336 = (java.lang.Boolean)__r3337;
            }
            __r3335 = __r3336;
           }
           __r3334 = (java.lang.Boolean)__r3335;
          }
          __r3332 = __r3334;
         }
         __r3329 = __r3332;
        }
        __r3327 = __r3329;
       }
       __r3326 = __r3327;
      }
      Object __r3338 = __r3326;
      if (__r3338 != null && !(__r3338 == Boolean.FALSE)) {
       java.lang.Object considered2___aux = ((IFn)const__6.getRawRoot()).invoke(considered2, mk6);
       java.lang.Object meths3___aux = ((IFn)const__7.getRawRoot()).invoke(meths3);
       considered2 = considered2___aux;
       meths3 = meths3___aux;
       continue;
      } else {
       java.lang.Object mm1___aux = ((IFn)const__8.getRawRoot()).invoke(mm1, mk6, meth4);
       java.lang.Object considered2___aux = ((IFn)const__6.getRawRoot()).invoke(considered2, mk6);
       java.lang.Object meths3___aux = ((IFn)const__7.getRawRoot()).invoke(meths3);
       mm1 = mm1___aux;
       considered2 = considered2___aux;
       meths3 = meths3___aux;
       continue;
      }
     }
    } else {
     return RT.vector(mm1, considered2);
    }
   }
  }
 }
}

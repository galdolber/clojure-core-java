package clojure;

import clojure.lang.*;

public final class core_find_field extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final java.lang.Object const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Var const__4;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "=");
  const__1 = (java.lang.Object)java.lang.Object.class;
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "str");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "first");
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "filter");
 }
 public core_find_field() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object c1, java.lang.Object f2) {
  {
   Object start_class3 = c1;
   {
    Object c4 = c1;
    while(true) {
     if (clojure.lang.Util.equiv(((java.lang.Object)c4), ((java.lang.Object)const__1))) {
      Util.trow((Throwable)new java.lang.Exception((java.lang.String)((java.lang.String)((IFn)const__2.getRawRoot()).invoke("field, ", f2, ", not defined in class, ", start_class3, ", or its ancestors"))));
      return null;
     } else {
      {
       Object dflds5 = ((java.lang.reflect.Field[])((java.lang.Class)c4).getDeclaredFields());
       Object rfld6 = ((IFn)const__3.getRawRoot()).invoke(((IFn)const__4.getRawRoot()).invoke(new clojure.core_find_field_fn__5535(f2), dflds5));
       {
        Object or__3968__auto__7 = rfld6;
        Object __r3528 = or__3968__auto__7;
        if (__r3528 != null && !(__r3528 == Boolean.FALSE)) {
         return or__3968__auto__7;
        } else {
         java.lang.Object c4___aux = ((java.lang.Class)((java.lang.Class)c4).getSuperclass());
         c4 = c4___aux;
         continue;
        }
       }
      }
     }
    }
   }
  }
 }
}

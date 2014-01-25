package clojure;

import clojure.lang.*;

public final class zip_next extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Keyword const__1;
 public static final java.lang.Object const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Var const__4;
 public static final clojure.lang.Var const__5;
 public static final clojure.lang.Var const__6;
 public static final clojure.lang.Var const__7;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "=");
  const__1 = (clojure.lang.Keyword)Keyword.intern(null, "end");
  const__2 = (java.lang.Object)1L;
  const__3 = (clojure.lang.Var)RT.var("clojure.zip", "branch?");
  const__4 = (clojure.lang.Var)RT.var("clojure.zip", "down");
  const__5 = (clojure.lang.Var)RT.var("clojure.zip", "right");
  const__6 = (clojure.lang.Var)RT.var("clojure.zip", "up");
  const__7 = (clojure.lang.Var)RT.var("clojure.zip", "node");
 }
 public zip_next() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object loc1) {
  if (clojure.lang.Util.equiv(((java.lang.Object)const__1), ((java.lang.Object)((IFn)loc1).invoke(const__2)))) {
   return loc1;
  } else {
   {
    Object __r4603 = null;
    {
     Object and__3966__auto__2 = ((IFn)const__3.getRawRoot()).invoke(loc1);
     Object __r4604;
     Object __r4605 = and__3966__auto__2;
     if (__r4605 != null && !(__r4605 == Boolean.FALSE)) {
      __r4604 = ((IFn)const__4.getRawRoot()).invoke(loc1);
     } else {
      __r4604 = and__3966__auto__2;
     }
     __r4603 = __r4604;
    }
    Object or__3968__auto__3 = __r4603;
    Object __r4607 = or__3968__auto__3;
    if (__r4607 != null && !(__r4607 == Boolean.FALSE)) {
     return or__3968__auto__3;
    } else {
     {
      Object or__3968__auto__4 = ((IFn)const__5.getRawRoot()).invoke(loc1);
      Object __r4609 = or__3968__auto__4;
      if (__r4609 != null && !(__r4609 == Boolean.FALSE)) {
       return or__3968__auto__4;
      } else {
       {
        Object p5 = loc1;
        while(true) {
         Object __r4611 = ((IFn)const__6.getRawRoot()).invoke(p5);
         if (__r4611 != null && !(__r4611 == Boolean.FALSE)) {
          {
           Object or__3968__auto__6 = ((IFn)const__5.getRawRoot()).invoke(((IFn)const__6.getRawRoot()).invoke(p5));
           Object __r4613 = or__3968__auto__6;
           if (__r4613 != null && !(__r4613 == Boolean.FALSE)) {
            return or__3968__auto__6;
           } else {
            java.lang.Object p5___aux = ((IFn)const__6.getRawRoot()).invoke(p5);
            p5 = p5___aux;
            continue;
           }
          }
         } else {
          return RT.vector(((IFn)const__7.getRawRoot()).invoke(p5), const__1);
         }
        }
       }
      }
     }
    }
   }
  }
 }
}

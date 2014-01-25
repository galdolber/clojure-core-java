package clojure;

import clojure.lang.*;

public final class zip_prev extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Var const__4;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.zip", "left");
  const__1 = (clojure.lang.Var)RT.var("clojure.zip", "branch?");
  const__2 = (clojure.lang.Var)RT.var("clojure.zip", "down");
  const__3 = (clojure.lang.Var)RT.var("clojure.zip", "rightmost");
  const__4 = (clojure.lang.Var)RT.var("clojure.zip", "up");
 }
 public zip_prev() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object loc1) {
  {
   Object temp__4115__auto__2 = ((IFn)const__0.getRawRoot()).invoke(loc1);
   Object __r4615 = temp__4115__auto__2;
   if (__r4615 != null && !(__r4615 == Boolean.FALSE)) {
    {
     Object lloc3 = temp__4115__auto__2;
     {
      Object loc4 = lloc3;
      while(true) {
       {
        Object __r4616 = null;
        {
         Object and__3966__auto__5 = ((IFn)const__1.getRawRoot()).invoke(loc4);
         Object __r4617;
         Object __r4618 = and__3966__auto__5;
         if (__r4618 != null && !(__r4618 == Boolean.FALSE)) {
          __r4617 = ((IFn)const__2.getRawRoot()).invoke(loc4);
         } else {
          __r4617 = and__3966__auto__5;
         }
         __r4616 = __r4617;
        }
        Object temp__4115__auto__6 = __r4616;
        Object __r4620 = temp__4115__auto__6;
        if (__r4620 != null && !(__r4620 == Boolean.FALSE)) {
         {
          Object child7 = temp__4115__auto__6;
          java.lang.Object loc4___aux = ((IFn)const__3.getRawRoot()).invoke(child7);
          loc4 = loc4___aux;
          continue;
         }
        } else {
         return loc4;
        }
       }
      }
     }
    }
   } else {
    return ((IFn)const__4.getRawRoot()).invoke(loc1);
   }
  }
 }
}

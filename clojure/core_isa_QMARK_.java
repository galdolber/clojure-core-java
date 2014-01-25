package clojure;

import clojure.lang.*;

public final class core_isa_QMARK_ extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Var const__4;
 public static final clojure.lang.Keyword const__5;
 public static final clojure.lang.Var const__6;
 public static final clojure.lang.Var const__7;
 public static final clojure.lang.Var const__8;
 public static final clojure.lang.Var const__9;
 public static final java.lang.Object const__10;
 public static final clojure.lang.Var const__11;
 public static final clojure.lang.Var const__12;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "isa?");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "global-hierarchy");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "=");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "class?");
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "contains?");
  const__5 = (clojure.lang.Keyword)Keyword.intern(null, "ancestors");
  const__6 = (clojure.lang.Var)RT.var("clojure.core", "some");
  const__7 = (clojure.lang.Var)RT.var("clojure.core", "supers");
  const__8 = (clojure.lang.Var)RT.var("clojure.core", "vector?");
  const__9 = (clojure.lang.Var)RT.var("clojure.core", "count");
  const__10 = (java.lang.Object)0L;
  const__11 = (clojure.lang.Var)RT.var("clojure.core", "not");
  const__12 = (clojure.lang.Var)RT.var("clojure.core", "inc");
 }
 public core_isa_QMARK_() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object h1, java.lang.Object child2, java.lang.Object parent3) {
  {
   boolean or__3968__auto__4 = clojure.lang.Util.equiv(((java.lang.Object)child2), ((java.lang.Object)parent3));
   if (or__3968__auto__4) {
    return (or__3968__auto__4 ? Boolean.TRUE : Boolean.FALSE);
   } else {
    {
     Object __r3037 = null;
     {
      Object and__3966__auto__5 = ((IFn)const__3.getRawRoot()).invoke(parent3);
      Object __r3038;
      Object __r3039 = and__3966__auto__5;
      if (__r3039 != null && !(__r3039 == Boolean.FALSE)) {
       Object __r3040 = null;
       {
        Object and__3966__auto__6 = ((IFn)const__3.getRawRoot()).invoke(child2);
        Object __r3041;
        Object __r3042 = and__3966__auto__6;
        if (__r3042 != null && !(__r3042 == Boolean.FALSE)) {
         __r3041 = (((java.lang.Class)parent3).isAssignableFrom((java.lang.Class)((java.lang.Class)child2)) ? Boolean.TRUE : Boolean.FALSE);
        } else {
         __r3041 = and__3966__auto__6;
        }
        __r3040 = __r3041;
       }
       __r3038 = __r3040;
      } else {
       __r3038 = and__3966__auto__5;
      }
      __r3037 = __r3038;
     }
     Object or__3968__auto__7 = __r3037;
     Object __r3044 = or__3968__auto__7;
     if (__r3044 != null && !(__r3044 == Boolean.FALSE)) {
      return or__3968__auto__7;
     } else {
      {
       Object or__3968__auto__8 = ((IFn)const__4.getRawRoot()).invoke(((IFn)RT.get(h1, Keyword.intern(null, "ancestors"))).invoke(child2), parent3);
       Object __r3046 = or__3968__auto__8;
       if (__r3046 != null && !(__r3046 == Boolean.FALSE)) {
        return or__3968__auto__8;
       } else {
        {
         Object __r3047 = null;
         {
          Object and__3966__auto__9 = ((IFn)const__3.getRawRoot()).invoke(child2);
          Object __r3048;
          Object __r3049 = and__3966__auto__9;
          if (__r3049 != null && !(__r3049 == Boolean.FALSE)) {
           __r3048 = ((IFn)const__6.getRawRoot()).invoke(new clojure.core_isa_QMARK__fn__4884(parent3, h1), ((IFn)const__7.getRawRoot()).invoke(child2));
          } else {
           __r3048 = and__3966__auto__9;
          }
          __r3047 = __r3048;
         }
         Object or__3968__auto__10 = __r3047;
         Object __r3051 = or__3968__auto__10;
         if (__r3051 != null && !(__r3051 == Boolean.FALSE)) {
          return or__3968__auto__10;
         } else {
          {
           Object and__3966__auto__11 = ((IFn)const__8.getRawRoot()).invoke(parent3);
           Object __r3053 = and__3966__auto__11;
           if (__r3053 != null && !(__r3053 == Boolean.FALSE)) {
            {
             Object and__3966__auto__12 = ((IFn)const__8.getRawRoot()).invoke(child2);
             Object __r3055 = and__3966__auto__12;
             if (__r3055 != null && !(__r3055 == Boolean.FALSE)) {
              {
               boolean and__3966__auto__13 = clojure.lang.Util.equiv((long)clojure.lang.RT.count(((java.lang.Object)parent3)), (long)clojure.lang.RT.count(((java.lang.Object)child2)));
               if (and__3966__auto__13) {
                {
                 Object ret14 = Boolean.TRUE;
                 long i15 = 0L;
                 while(true) {
                  Object __r3058 = null;
                  {
                   Object or__3968__auto__16 = ((IFn)const__11.getRawRoot()).invoke(ret14);
                   Object __r3059;
                   Object __r3060 = or__3968__auto__16;
                   if (__r3060 != null && !(__r3060 == Boolean.FALSE)) {
                    __r3059 = or__3968__auto__16;
                   } else {
                    __r3059 = (clojure.lang.Util.equiv((long)i15, (long)clojure.lang.RT.count(((java.lang.Object)parent3))) ? Boolean.TRUE : Boolean.FALSE);
                   }
                   __r3058 = __r3059;
                  }
                  Object __r3061 = __r3058;
                  if (__r3061 != null && !(__r3061 == Boolean.FALSE)) {
                   return ret14;
                  } else {
                   java.lang.Object ret14___aux = ((IFn)const__0.getRawRoot()).invoke(h1, ((IFn)child2).invoke(Numbers.num(i15)), ((IFn)parent3).invoke(Numbers.num(i15)));
                   long i15___aux = clojure.lang.Numbers.inc((long)i15);
                   ret14 = ret14___aux;
                   i15 = i15___aux;
                   continue;
                  }
                 }
                }
               } else {
                return (and__3966__auto__13 ? Boolean.TRUE : Boolean.FALSE);
               }
              }
             } else {
              return and__3966__auto__12;
             }
            }
           } else {
            return and__3966__auto__11;
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
 }
 public java.lang.Object invoke(java.lang.Object child1, java.lang.Object parent2) {
  return ((IFn)const__0.getRawRoot()).invoke(const__1.getRawRoot(), child1, parent2);
 }
}

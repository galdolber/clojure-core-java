package clojure;

import clojure.lang.*;

public final class pprint_fn__8090_fn__8091 extends clojure.lang.AFunction {
 public static final clojure.lang.Keyword const__0;
 public static final clojure.lang.Keyword const__1;
 public static final clojure.lang.Keyword const__2;
 public static final clojure.lang.Keyword const__3;
 public static final clojure.lang.Keyword const__4;
 public static final clojure.lang.Keyword const__5;
 public static final clojure.lang.Var const__6;
 public static final clojure.lang.Var const__7;
 public static final java.lang.Object const__8;
 public static final clojure.lang.Var const__9;
 public static final clojure.lang.Keyword const__10;
 public static final clojure.lang.Keyword const__11;
 static {
  const__0 = (clojure.lang.Keyword)Keyword.intern(null, "arg1");
  const__1 = (clojure.lang.Keyword)Keyword.intern(null, "arg2");
  const__2 = (clojure.lang.Keyword)Keyword.intern(null, "arg3");
  const__3 = (clojure.lang.Keyword)Keyword.intern(null, "colon");
  const__4 = (clojure.lang.Keyword)Keyword.intern(null, "colon-up-arrow");
  const__5 = (clojure.lang.Keyword)Keyword.intern(null, "up-arrow");
  const__6 = (clojure.lang.Var)RT.var("clojure.core", "<=");
  const__7 = (clojure.lang.Var)RT.var("clojure.core", "=");
  const__8 = (java.lang.Object)0L;
  const__9 = (clojure.lang.Var)RT.var("clojure.core", "empty?");
  const__10 = (clojure.lang.Keyword)Keyword.intern(null, "rest");
  const__11 = (clojure.lang.Keyword)Keyword.intern(null, "base-args");
 }
 public pprint_fn__8090_fn__8091() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object params1, java.lang.Object navigator2, java.lang.Object offsets3) {
  {
   Object arg14 = RT.get(params1, Keyword.intern(null, "arg1"));
   Object arg25 = RT.get(params1, Keyword.intern(null, "arg2"));
   Object arg36 = RT.get(params1, Keyword.intern(null, "arg3"));
   Object __r5712;
   Object __r5713 = RT.get(params1, Keyword.intern(null, "colon"));
   if (__r5713 != null && !(__r5713 == Boolean.FALSE)) {
    __r5712 = const__4;
   } else {
    __r5712 = const__5;
   }
   Object exit7 = __r5712;
   Object __r5715 = null;
   {
    Object and__3966__auto__8 = arg14;
    Object __r5716;
    Object __r5717 = and__3966__auto__8;
    if (__r5717 != null && !(__r5717 == Boolean.FALSE)) {
     Object __r5718 = null;
     {
      Object and__3966__auto__9 = arg25;
      Object __r5719;
      Object __r5720 = and__3966__auto__9;
      if (__r5720 != null && !(__r5720 == Boolean.FALSE)) {
       __r5719 = arg36;
      } else {
       __r5719 = and__3966__auto__9;
      }
      __r5718 = __r5719;
     }
     __r5716 = __r5718;
    } else {
     __r5716 = and__3966__auto__8;
    }
    __r5715 = __r5716;
   }
   Object __r5721 = __r5715;
   if (__r5721 != null && !(__r5721 == Boolean.FALSE)) {
    Object __r5723 = ((IFn)const__6.getRawRoot()).invoke(arg14, arg25, arg36);
    if (__r5723 != null && !(__r5723 == Boolean.FALSE)) {
     return RT.vector(exit7, navigator2);
    } else {
     return navigator2;
    }
   } else {
    Object __r5725 = null;
    {
     Object and__3966__auto__10 = arg14;
     Object __r5726;
     Object __r5727 = and__3966__auto__10;
     if (__r5727 != null && !(__r5727 == Boolean.FALSE)) {
      __r5726 = arg25;
     } else {
      __r5726 = and__3966__auto__10;
     }
     __r5725 = __r5726;
    }
    Object __r5728 = __r5725;
    if (__r5728 != null && !(__r5728 == Boolean.FALSE)) {
     if (clojure.lang.Util.equiv(((java.lang.Object)arg14), ((java.lang.Object)arg25))) {
      return RT.vector(exit7, navigator2);
     } else {
      return navigator2;
     }
    } else {
     Object __r5731 = arg14;
     if (__r5731 != null && !(__r5731 == Boolean.FALSE)) {
      if (clojure.lang.Util.equiv(((java.lang.Object)arg14), (long)0L)) {
       return RT.vector(exit7, navigator2);
      } else {
       return navigator2;
      }
     } else {
      Object __r5734 = Boolean.TRUE;
      if (__r5734 != null && !(__r5734 == Boolean.FALSE)) {
       Object __r5736;
       Object __r5737 = RT.get(params1, Keyword.intern(null, "colon"));
       if (__r5737 != null && !(__r5737 == Boolean.FALSE)) {
        __r5736 = ((IFn)const__9.getRawRoot()).invoke(RT.get(RT.get(params1, Keyword.intern(null, "base-args")), Keyword.intern(null, "rest")));
       } else {
        __r5736 = ((IFn)const__9.getRawRoot()).invoke(RT.get(navigator2, Keyword.intern(null, "rest")));
       }
       Object __r5738 = __r5736;
       if (__r5738 != null && !(__r5738 == Boolean.FALSE)) {
        return RT.vector(exit7, navigator2);
       } else {
        return navigator2;
       }
      } else {
       return null;
      }
     }
    }
   }
  }
 }
}

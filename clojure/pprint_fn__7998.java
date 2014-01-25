package clojure;

import clojure.lang.*;

public final class pprint_fn__7998 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Keyword const__1;
 public static final clojure.lang.Keyword const__2;
 public static final clojure.lang.Keyword const__3;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "first");
  const__1 = (clojure.lang.Keyword)Keyword.intern(null, "base");
  const__2 = (clojure.lang.Keyword)Keyword.intern(null, "at");
  const__3 = (clojure.lang.Keyword)Keyword.intern(null, "colon");
 }
 public pprint_fn__7998() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object params1, java.lang.Object offset2) {
  Object __r5647 = ((IFn)const__0.getRawRoot()).invoke(RT.get(params1, Keyword.intern(null, "base")));
  if (__r5647 != null && !(__r5647 == Boolean.FALSE)) {
   return new clojure.pprint_fn__7998_fn__7999();
  } else {
   Object __r5649 = null;
   {
    Object and__3966__auto__3 = RT.get(params1, Keyword.intern(null, "at"));
    Object __r5650;
    Object __r5651 = and__3966__auto__3;
    if (__r5651 != null && !(__r5651 == Boolean.FALSE)) {
     __r5650 = RT.get(params1, Keyword.intern(null, "colon"));
    } else {
     __r5650 = and__3966__auto__3;
    }
    __r5649 = __r5650;
   }
   Object __r5652 = __r5649;
   if (__r5652 != null && !(__r5652 == Boolean.FALSE)) {
    return new clojure.pprint_fn__7998_fn__8001();
   } else {
    Object __r5654 = RT.get(params1, Keyword.intern(null, "at"));
    if (__r5654 != null && !(__r5654 == Boolean.FALSE)) {
     return new clojure.pprint_fn__7998_fn__8003();
    } else {
     Object __r5656 = RT.get(params1, Keyword.intern(null, "colon"));
     if (__r5656 != null && !(__r5656 == Boolean.FALSE)) {
      return new clojure.pprint_fn__7998_fn__8005();
     } else {
      Object __r5658 = Boolean.TRUE;
      if (__r5658 != null && !(__r5658 == Boolean.FALSE)) {
       return new clojure.pprint_fn__7998_fn__8007();
      } else {
       return null;
      }
     }
    }
   }
  }
 }
}

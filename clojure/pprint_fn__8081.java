package clojure;

import clojure.lang.*;

public final class pprint_fn__8081 extends clojure.lang.AFunction {
 public static final clojure.lang.Keyword const__0;
 public static final clojure.lang.Keyword const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Var const__4;
 public static final clojure.lang.Var const__5;
 static {
  const__0 = (clojure.lang.Keyword)Keyword.intern(null, "at");
  const__1 = (clojure.lang.Keyword)Keyword.intern(null, "colon");
  const__2 = (clojure.lang.Var)RT.var("clojure.pprint", "iterate-main-sublists");
  const__3 = (clojure.lang.Var)RT.var("clojure.pprint", "iterate-list-of-sublists");
  const__4 = (clojure.lang.Var)RT.var("clojure.pprint", "iterate-main-list");
  const__5 = (clojure.lang.Var)RT.var("clojure.pprint", "iterate-sublist");
 }
 public pprint_fn__8081() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object params1, java.lang.Object offset2) {
  Object __r5702 = null;
  {
   Object and__3966__auto__3 = RT.get(params1, Keyword.intern(null, "at"));
   Object __r5703;
   Object __r5704 = and__3966__auto__3;
   if (__r5704 != null && !(__r5704 == Boolean.FALSE)) {
    __r5703 = RT.get(params1, Keyword.intern(null, "colon"));
   } else {
    __r5703 = and__3966__auto__3;
   }
   __r5702 = __r5703;
  }
  Object __r5705 = __r5702;
  if (__r5705 != null && !(__r5705 == Boolean.FALSE)) {
   return const__2.getRawRoot();
  } else {
   Object __r5707 = RT.get(params1, Keyword.intern(null, "colon"));
   if (__r5707 != null && !(__r5707 == Boolean.FALSE)) {
    return const__3.getRawRoot();
   } else {
    Object __r5709 = RT.get(params1, Keyword.intern(null, "at"));
    if (__r5709 != null && !(__r5709 == Boolean.FALSE)) {
     return const__4.getRawRoot();
    } else {
     Object __r5711 = Boolean.TRUE;
     if (__r5711 != null && !(__r5711 == Boolean.FALSE)) {
      return const__5.getRawRoot();
     } else {
      return null;
     }
    }
   }
  }
 }
}

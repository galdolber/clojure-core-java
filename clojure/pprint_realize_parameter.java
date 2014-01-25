package clojure;

import clojure.lang.*;

public final class pprint_realize_parameter extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final java.lang.Object const__1;
 public static final java.lang.Object const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Keyword const__4;
 public static final clojure.lang.Keyword const__5;
 public static final clojure.lang.IPersistentSet const__6;
 public static final clojure.lang.Var const__7;
 public static final clojure.lang.Keyword const__8;
 public static final clojure.lang.Var const__9;
 public static final clojure.lang.Keyword const__10;
 public static final clojure.lang.Var const__11;
 public static final clojure.lang.Keyword const__12;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "nth");
  const__1 = (java.lang.Object)0L;
  const__2 = (java.lang.Object)1L;
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "contains?");
  const__4 = (clojure.lang.Keyword)Keyword.intern(null, "colon");
  const__5 = (clojure.lang.Keyword)Keyword.intern(null, "at");
  const__6 = (clojure.lang.IPersistentSet)PersistentHashSet.create(Keyword.intern(null, "colon"), Keyword.intern(null, "at"));
  const__7 = (clojure.lang.Var)RT.var("clojure.core", "=");
  const__8 = (clojure.lang.Keyword)Keyword.intern(null, "parameter-from-args");
  const__9 = (clojure.lang.Var)RT.var("clojure.pprint", "next-arg");
  const__10 = (clojure.lang.Keyword)Keyword.intern(null, "remaining-arg-count");
  const__11 = (clojure.lang.Var)RT.var("clojure.core", "count");
  const__12 = (clojure.lang.Keyword)Keyword.intern(null, "rest");
 }
 public pprint_realize_parameter() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object p__76681, java.lang.Object navigator2) {
  {
   Object vec__76693 = p__76681;
   Object param4 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__76693), (int)RT.intCast(0L), ((java.lang.Object)null)));
   Object vec__76705 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__76693), (int)RT.intCast(1L), ((java.lang.Object)null)));
   Object raw_val6 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__76705), (int)RT.intCast(0L), ((java.lang.Object)null)));
   Object offset7 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__76705), (int)RT.intCast(1L), ((java.lang.Object)null)));
   {
    Object __r5058;
    Object __r5059 = ((IFn)const__3.getRawRoot()).invoke(const__6, param4);
    if (__r5059 != null && !(__r5059 == Boolean.FALSE)) {
     __r5058 = RT.vector(raw_val6, navigator2);
    } else {
     Object __r5060;
     if (clojure.lang.Util.equiv(((java.lang.Object)raw_val6), ((java.lang.Object)const__8))) {
      __r5060 = ((IFn)const__9.getRawRoot()).invoke(navigator2);
     } else {
      Object __r5061;
      if (clojure.lang.Util.equiv(((java.lang.Object)raw_val6), ((java.lang.Object)const__10))) {
       __r5061 = RT.vector(Integer.valueOf(clojure.lang.RT.count(((java.lang.Object)RT.get(navigator2, Keyword.intern(null, "rest"))))), navigator2);
      } else {
       Object __r5062;
       Object __r5063 = Boolean.TRUE;
       if (__r5063 != null && !(__r5063 == Boolean.FALSE)) {
        __r5062 = RT.vector(raw_val6, navigator2);
       } else {
        __r5062 = null;
       }
       __r5061 = __r5062;
      }
      __r5060 = __r5061;
     }
     __r5058 = __r5060;
    }
    Object vec__76718 = __r5058;
    Object real_param9 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__76718), (int)RT.intCast(0L), ((java.lang.Object)null)));
    Object new_navigator10 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__76718), (int)RT.intCast(1L), ((java.lang.Object)null)));
    return RT.vector(RT.vector(param4, RT.vector(real_param9, offset7)), new_navigator10);
   }
  }
 }
}

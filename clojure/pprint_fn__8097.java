package clojure;

import clojure.lang.*;

public final class pprint_fn__8097 extends clojure.lang.AFunction {
 public static final clojure.lang.Keyword const__0;
 public static final clojure.lang.Keyword const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Keyword const__3;
 public static final clojure.lang.Keyword const__4;
 public static final clojure.lang.IPersistentStack const__5;
 public static final clojure.lang.Keyword const__6;
 public static final clojure.lang.IPersistentStack const__7;
 static {
  const__0 = (clojure.lang.Keyword)Keyword.intern(null, "at");
  const__1 = (clojure.lang.Keyword)Keyword.intern(null, "colon");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "concat");
  const__3 = (clojure.lang.Keyword)Keyword.intern(null, "level");
  const__4 = (clojure.lang.Keyword)Keyword.intern(null, "length");
  const__5 = (clojure.lang.IPersistentStack)RT.vector(Keyword.intern(null, "level"), null, Keyword.intern(null, "length"), null);
  const__6 = (clojure.lang.Keyword)Keyword.intern(null, "pretty");
  const__7 = (clojure.lang.IPersistentStack)RT.vector(Keyword.intern(null, "pretty"), Boolean.TRUE);
 }
 public pprint_fn__8097() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object params1, java.lang.Object offset2) {
  Object __r5744 = null;
  {
   Object or__3968__auto__3 = RT.get(params1, Keyword.intern(null, "at"));
   Object __r5745;
   Object __r5746 = or__3968__auto__3;
   if (__r5746 != null && !(__r5746 == Boolean.FALSE)) {
    __r5745 = or__3968__auto__3;
   } else {
    __r5745 = RT.get(params1, Keyword.intern(null, "colon"));
   }
   __r5744 = __r5745;
  }
  Object __r5747 = __r5744;
  if (__r5747 != null && !(__r5747 == Boolean.FALSE)) {
   {
    Object __r5748;
    Object __r5749 = RT.get(params1, Keyword.intern(null, "at"));
    if (__r5749 != null && !(__r5749 == Boolean.FALSE)) {
     __r5748 = const__5;
    } else {
     __r5748 = clojure.lang.PersistentVector.EMPTY;
    }
    Object __r5750;
    Object __r5751 = RT.get(params1, Keyword.intern(null, "colon"));
    if (__r5751 != null && !(__r5751 == Boolean.FALSE)) {
     __r5750 = const__7;
    } else {
     __r5750 = clojure.lang.PersistentVector.EMPTY;
    }
    Object bindings4 = ((IFn)const__2.getRawRoot()).invoke(__r5748, __r5750);
    return new clojure.pprint_fn__8097_fn__8098(bindings4);
   }
  } else {
   return new clojure.pprint_fn__8097_fn__8101();
  }
 }
}

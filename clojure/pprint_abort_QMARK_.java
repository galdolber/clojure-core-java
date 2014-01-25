package clojure;

import clojure.lang.*;

public final class pprint_abort_QMARK_ extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Keyword const__2;
 public static final clojure.lang.Keyword const__3;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "first");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "=");
  const__2 = (clojure.lang.Keyword)Keyword.intern(null, "up-arrow");
  const__3 = (clojure.lang.Keyword)Keyword.intern(null, "colon-up-arrow");
 }
 public pprint_abort_QMARK_() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object context1) {
  {
   Object token2 = ((IFn)const__0.getRawRoot()).invoke(context1);
   {
    boolean or__3968__auto__3 = clojure.lang.Util.equiv(((java.lang.Object)const__2), ((java.lang.Object)token2));
    if (or__3968__auto__3) {
     return (or__3968__auto__3 ? Boolean.TRUE : Boolean.FALSE);
    } else {
     return (clojure.lang.Util.equiv(((java.lang.Object)const__3), ((java.lang.Object)token2)) ? Boolean.TRUE : Boolean.FALSE);
    }
   }
  }
 }
}

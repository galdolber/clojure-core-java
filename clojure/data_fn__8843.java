package clojure;

import clojure.lang.*;

public final class data_fn__8843 extends clojure.lang.AFunction {
 public static final clojure.lang.Keyword const__0;
 public static final clojure.lang.Keyword const__1;
 static {
  const__0 = (clojure.lang.Keyword)Keyword.intern(null, "sequential");
  const__1 = (clojure.lang.Keyword)Keyword.intern(null, "atom");
 }
 public data_fn__8843() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object x1) {
  Object __r6396 = Reflector.invokeNoArgInstanceMember(Reflector.invokeNoArgInstanceMember(x1, "getClass"), "isArray");
  if (__r6396 != null && !(__r6396 == Boolean.FALSE)) {
   return const__0;
  } else {
   return const__1;
  }
 }
}

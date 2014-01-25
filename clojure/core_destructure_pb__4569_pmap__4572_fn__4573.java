package clojure;

import clojure.lang.*;

public final class core_destructure_pb__4569_pmap__4572_fn__4573 extends clojure.lang.AFunction {
 public static final clojure.lang.Keyword const__0;
 public static final clojure.lang.Var const__1;
 static {
  const__0 = (clojure.lang.Keyword)Keyword.intern(null, "as");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "conj");
 }
 Object gmap4;
 Object b2;
 public core_destructure_pb__4569_pmap__4572_fn__4573(final Object gmap4, final Object b2) {
  super();
  this.gmap4 = gmap4;
  this.b2 = b2;
 }
 public java.lang.Object invoke(java.lang.Object ret1) {
  Object __r2797 = RT.get(this.b2, Keyword.intern(null, "as"));
  if (__r2797 != null && !(__r2797 == Boolean.FALSE)) {
   return ((IFn)const__1.getRawRoot()).invoke(ret1, RT.get(this.b2, Keyword.intern(null, "as")), this.gmap4);
  } else {
   return ret1;
  }
 }
}

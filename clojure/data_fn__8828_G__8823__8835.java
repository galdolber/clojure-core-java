package clojure;

import clojure.lang.*;

public final class data_fn__8828_G__8823__8835 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final java.lang.Object const__1;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "-cache-protocol-fn");
  const__1 = (java.lang.Object)clojure.data.Diff.class;
 }
 Object G__88242;
 public data_fn__8828_G__8823__8835(final Object G__88242) {
  super();
  this.G__88242 = G__88242;
 }
 public java.lang.Object invoke(java.lang.Object gf__a__88331, java.lang.Object gf__b__88342) {
  {
   Object cache__5922__auto__3 = ((clojure.lang.MethodImplCache)((clojure.lang.AFunction)this).__methodImplCache);
   Object f__5923__auto__4 = ((clojure.lang.IFn)((clojure.lang.MethodImplCache)cache__5922__auto__3).fnFor((java.lang.Class)((java.lang.Class)((java.lang.Class)clojure.lang.Util.classOf(((java.lang.Object)gf__a__88331))))));
   Object __r6392 = f__5923__auto__4;
   if (__r6392 != null && !(__r6392 == Boolean.FALSE)) {
    return ((IFn)f__5923__auto__4).invoke(gf__a__88331, gf__b__88342);
   } else {
    return ((IFn)((IFn)const__0.getRawRoot()).invoke(this, gf__a__88331, const__1, this.G__88242)).invoke(gf__a__88331, gf__b__88342);
   }
  }
 }
}

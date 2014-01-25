package clojure;

import clojure.lang.*;

public final class data_fn__8812_G__8807__8817 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final java.lang.Object const__1;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "-cache-protocol-fn");
  const__1 = (java.lang.Object)clojure.data.EqualityPartition.class;
 }
 Object G__88082;
 public data_fn__8812_G__8807__8817(final Object G__88082) {
  super();
  this.G__88082 = G__88082;
 }
 public java.lang.Object invoke(java.lang.Object gf__x__88161) {
  {
   Object cache__5922__auto__2 = ((clojure.lang.MethodImplCache)((clojure.lang.AFunction)this).__methodImplCache);
   Object f__5923__auto__3 = ((clojure.lang.IFn)((clojure.lang.MethodImplCache)cache__5922__auto__2).fnFor((java.lang.Class)((java.lang.Class)((java.lang.Class)clojure.lang.Util.classOf(((java.lang.Object)gf__x__88161))))));
   Object __r6389 = f__5923__auto__3;
   if (__r6389 != null && !(__r6389 == Boolean.FALSE)) {
    return ((IFn)f__5923__auto__3).invoke(gf__x__88161);
   } else {
    return ((IFn)((IFn)const__0.getRawRoot()).invoke(this, gf__x__88161, const__1, this.G__88082)).invoke(gf__x__88161);
   }
  }
 }
}

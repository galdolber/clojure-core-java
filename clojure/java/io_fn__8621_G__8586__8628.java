package clojure.java;

import clojure.lang.*;

public final class io_fn__8621_G__8586__8628 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final java.lang.Object const__1;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "-cache-protocol-fn");
  const__1 = (java.lang.Object)clojure.java.io.IOFactory.class;
 }
 Object G__85872;
 public io_fn__8621_G__8586__8628(final Object G__85872) {
  super();
  this.G__85872 = G__85872;
 }
 public java.lang.Object invoke(java.lang.Object gf__x__86261, java.lang.Object gf__opts__86272) {
  {
   Object cache__5922__auto__3 = ((clojure.lang.MethodImplCache)((clojure.lang.AFunction)this).__methodImplCache);
   Object f__5923__auto__4 = ((clojure.lang.IFn)((clojure.lang.MethodImplCache)cache__5922__auto__3).fnFor((java.lang.Class)((java.lang.Class)((java.lang.Class)clojure.lang.Util.classOf(((java.lang.Object)gf__x__86261))))));
   Object __r6244 = f__5923__auto__4;
   if (__r6244 != null && !(__r6244 == Boolean.FALSE)) {
    return ((IFn)f__5923__auto__4).invoke(gf__x__86261, gf__opts__86272);
   } else {
    return ((IFn)((IFn)const__0.getRawRoot()).invoke(this, gf__x__86261, const__1, this.G__85872)).invoke(gf__x__86261, gf__opts__86272);
   }
  }
 }
}

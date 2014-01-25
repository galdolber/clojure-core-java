package clojure.core;

import clojure.lang.*;

public final class protocols_fn__6038_G__6033__6051 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final java.lang.Object const__1;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "-cache-protocol-fn");
  const__1 = (java.lang.Object)clojure.core.protocols.CollReduce.class;
 }
 Object G__60342;
 public protocols_fn__6038_G__6033__6051(final Object G__60342) {
  super();
  this.G__60342 = G__60342;
 }
 public java.lang.Object invoke(java.lang.Object gf__coll__60481, java.lang.Object gf__f__60492, java.lang.Object gf__val__60503) {
  {
   Object cache__5922__auto__4 = ((clojure.lang.MethodImplCache)((clojure.lang.AFunction)this).__methodImplCache);
   Object f__5923__auto__5 = ((clojure.lang.IFn)((clojure.lang.MethodImplCache)cache__5922__auto__4).fnFor((java.lang.Class)((java.lang.Class)((java.lang.Class)clojure.lang.Util.classOf(((java.lang.Object)gf__coll__60481))))));
   Object __r3841 = f__5923__auto__5;
   if (__r3841 != null && !(__r3841 == Boolean.FALSE)) {
    return ((IFn)f__5923__auto__5).invoke(gf__coll__60481, gf__f__60492, gf__val__60503);
   } else {
    return ((IFn)((IFn)const__0.getRawRoot()).invoke(this, gf__coll__60481, const__1, this.G__60342)).invoke(gf__coll__60481, gf__f__60492, gf__val__60503);
   }
  }
 }
 public java.lang.Object invoke(java.lang.Object gf__coll__60461, java.lang.Object gf__f__60472) {
  {
   Object cache__5922__auto__3 = ((clojure.lang.MethodImplCache)((clojure.lang.AFunction)this).__methodImplCache);
   Object f__5923__auto__4 = ((clojure.lang.IFn)((clojure.lang.MethodImplCache)cache__5922__auto__3).fnFor((java.lang.Class)((java.lang.Class)((java.lang.Class)clojure.lang.Util.classOf(((java.lang.Object)gf__coll__60461))))));
   Object __r3843 = f__5923__auto__4;
   if (__r3843 != null && !(__r3843 == Boolean.FALSE)) {
    return ((IFn)f__5923__auto__4).invoke(gf__coll__60461, gf__f__60472);
   } else {
    return ((IFn)((IFn)const__0.getRawRoot()).invoke(this, gf__coll__60461, const__1, this.G__60342)).invoke(gf__coll__60461, gf__f__60472);
   }
  }
 }
}

package org.jnasockopt;

// This enum contains all the socket options used on any platform
// A perl script translates these into the appropriate values for each platform

public enum JNASockOption {
	ALG_SET_IV,
	ALG_SET_KEY,
	ALG_SET_OP,
	DCCP_SOCKOPT_AVAILABLE_CCIDS,
	DCCP_SOCKOPT_CCID,
	DCCP_SOCKOPT_CCID_RX_INFO,
	DCCP_SOCKOPT_CCID_TX_INFO,
	DCCP_SOCKOPT_CHANGE_L,
	DCCP_SOCKOPT_CHANGE_R,
	DCCP_SOCKOPT_GET_CUR_MPS,
	DCCP_SOCKOPT_PACKET_SIZE,
	DCCP_SOCKOPT_QPOLICY_ID,
	DCCP_SOCKOPT_QPOLICY_TXQLEN,
	DCCP_SOCKOPT_RECV_CSCOV,
	DCCP_SOCKOPT_RX_CCID,
	DCCP_SOCKOPT_SEND_CSCOV,
	DCCP_SOCKOPT_SERVER_TIMEWAIT,
	DCCP_SOCKOPT_SERVICE,
	DCCP_SOCKOPT_TX_CCID,
	ICMP6_FILTER,
	IPV6_2292DSTOPTS,
	IPV6_2292HOPLIMIT,
	IPV6_2292HOPOPTS,
	IPV6_2292NEXTHOP,
	IPV6_2292PKTINFO,
	IPV6_2292PKTOPTIONS,
	IPV6_2292RTHDR,
	IPV6_ADDRFORM,
	IPV6_ADD_MEMBERSHIP,
	IPV6_AUTHHDR,
	IPV6_CHECKSUM,
	IPV6_DROP_MEMBERSHIP,
	IPV6_DSTOPTS,
	IPV6_FLOWINFO,
	IPV6_HOPLIMIT,
	IPV6_HOPOPTS,
	IPV6_JOIN_ANYCAST,
	IPV6_JOIN_GROUP,
	IPV6_LEAVE_ANYCAST,
	IPV6_LEAVE_GROUP,
	IPV6_MTU,
	IPV6_MTU_DISCOVER,
	IPV6_MULTICAST_HOPS,
	IPV6_MULTICAST_IF,
	IPV6_MULTICAST_LOOP,
	IPV6_NEXTHOP,
	IPV6_OPTIONS,
	IPV6_PKTINFO,
	IPV6_PKTOPTIONS,
	IPV6_PORTRANGE,
	IPV6_RECVDSTADDR,
	IPV6_RECVERR,
	IPV6_RECVOPTS,
	IPV6_RECVRETOPTS,
	IPV6_RETOPTS,
	IPV6_ROUTER_ALERT,
	IPV6_RTHDR,
	IPV6_SOCKOPT_RESERVED1,
	IPV6_UNICAST_HOPS,
	IPV6_V6ONLY,
	IP_ADD_MEMBERSHIP,
	IP_ADD_SOURCE_MEMBERSHIP,
	IP_BLOCK_SOURCE,
	IP_BOUND_IF,
	IP_DROP_MEMBERSHIP,
	IP_DROP_SOURCE_MEMBERSHIP,
	IP_DUMMYNET_CONFIGURE,
	IP_DUMMYNET_DEL,
	IP_DUMMYNET_FLUSH,
	IP_DUMMYNET_GET,
	IP_FAITH,
	IP_FW_ADD,
	IP_FW_DEL,
	IP_FW_FLUSH,
	IP_FW_GET,
	IP_FW_RESETLOG,
	IP_FW_ZERO,
	IP_HDRINCL,
	IP_IPSEC_POLICY,
	IP_MSFILTER,
	IP_MULTICAST_IF,
	IP_MULTICAST_IFINDEX,
	IP_MULTICAST_LOOP,
	IP_MULTICAST_TTL,
	IP_MULTICAST_VIF,
	IP_NAT__XXX,
	IP_OLD_FW_ADD,
	IP_OLD_FW_DEL,
	IP_OLD_FW_FLUSH,
	IP_OLD_FW_GET,
	IP_OLD_FW_RESETLOG,
	IP_OLD_FW_ZERO,
	IP_OPTIONS,
	IP_PKTINFO,
	IP_PORTRANGE,
	IP_RECVDSTADDR,
	IP_RECVIF,
	IP_RECVOPTS,
	IP_RECVPKTINFO,
	IP_RECVRETOPTS,
	IP_RECVTTL,
	IP_RETOPTS,
	IP_RSVP_OFF,
	IP_RSVP_ON,
	IP_RSVP_VIF_OFF,
	IP_RSVP_VIF_ON,
	IP_STRIPHDR,
	IP_TOS,
	IP_TRAFFIC_MGT_BACKGROUND,
	IP_TTL,
	IP_UNBLOCK_SOURCE,
	IP_VS_BASE_CTL,
	IP_VS_SO_GET_DAEMON,
	IP_VS_SO_GET_DEST,
	IP_VS_SO_GET_DESTS,
	IP_VS_SO_GET_INFO,
	IP_VS_SO_GET_MAX,
	IP_VS_SO_GET_SERVICE,
	IP_VS_SO_GET_SERVICES,
	IP_VS_SO_GET_TIMEOUT,
	IP_VS_SO_GET_VERSION,
	IP_VS_SO_SET_ADD,
	IP_VS_SO_SET_ADDDEST,
	IP_VS_SO_SET_DEL,
	IP_VS_SO_SET_DELDEST,
	IP_VS_SO_SET_EDIT,
	IP_VS_SO_SET_EDITDEST,
	IP_VS_SO_SET_FLUSH,
	IP_VS_SO_SET_INSERT,
	IP_VS_SO_SET_LIST,
	IP_VS_SO_SET_MAX,
	IP_VS_SO_SET_NONE,
	IP_VS_SO_SET_RESTORE,
	IP_VS_SO_SET_SAVE,
	IP_VS_SO_SET_STARTDAEMON,
	IP_VS_SO_SET_STOPDAEMON,
	IP_VS_SO_SET_TIMEOUT,
	IP_VS_SO_SET_ZERO,
	LOCAL_PEERCRED,
	LOCAL_PEEREPID,
	LOCAL_PEEREUUID,
	LOCAL_PEERPID,
	LOCAL_PEERUUID,
	MCAST_BLOCK_SOURCE,
	MCAST_JOIN_GROUP,
	MCAST_JOIN_SOURCE_GROUP,
	MCAST_LEAVE_GROUP,
	MCAST_LEAVE_SOURCE_GROUP,
	MCAST_UNBLOCK_SOURCE,
	NFC_LLCP_MIUX,
	NFC_LLCP_REMOTE_LTO,
	NFC_LLCP_REMOTE_MIU,
	NFC_LLCP_REMOTE_RW,
	NFC_LLCP_RW,
	PACKET_ADD_MEMBERSHIP,
	PACKET_AUXDATA,
	PACKET_COPY_THRESH,
	PACKET_DROP_MEMBERSHIP,
	PACKET_FANOUT,
	PACKET_HDRLEN,
	PACKET_LOSS,
	PACKET_ORIGDEV,
	PACKET_RECV_OUTPUT,
	PACKET_RESERVE,
	PACKET_RX_RING,
	PACKET_STATISTICS,
	PACKET_TIMESTAMP,
	PACKET_TX_HAS_OFF,
	PACKET_TX_RING,
	PACKET_TX_TIMESTAMP,
	PACKET_VERSION,
	PACKET_VNET_HDR,
	PNPIPE_ENCAP,
	PNPIPE_HANDLE,
	PNPIPE_IFINDEX,
	PNPIPE_INITSTATE,
	SCM_TIMESTAMP,
	SCM_TIMESTAMPING,
	SCM_TIMESTAMPNS,
	SCM_WIFI_STATUS,
	SCTP_ADAPTATION_LAYER,
	SCTP_ASSOCINFO,
	SCTP_AUTH_ACTIVE_KEY,
	SCTP_AUTH_CHUNK,
	SCTP_AUTH_DELETE_KEY,
	SCTP_AUTH_KEY,
	SCTP_AUTOCLOSE,
	SCTP_AUTO_ASCONF,
	SCTP_CONTEXT,
	SCTP_DEFAULT_SEND_PARAM,
	SCTP_DELAYED_ACK,
	SCTP_DELAYED_ACK_TIME,
	SCTP_DELAYED_SACK,
	SCTP_DISABLE_FRAGMENTS,
	SCTP_EVENTS,
	SCTP_FRAGMENT_INTERLEAVE,
	SCTP_GET_ASSOC_ID_LIST,
	SCTP_GET_ASSOC_NUMBER,
	SCTP_GET_ASSOC_STATS,
	SCTP_GET_LOCAL_ADDRS,
	SCTP_GET_PEER_ADDRS,
	SCTP_GET_PEER_ADDR_INFO,
	SCTP_HMAC_IDENT,
	SCTP_INITMSG,
	SCTP_I_WANT_MAPPED_V4_ADDR,
	SCTP_LOCAL_AUTH_CHUNKS,
	SCTP_MAXSEG,
	SCTP_MAX_BURST,
	SCTP_NODELAY,
	SCTP_PARTIAL_DELIVERY_POINT,
	SCTP_PEER_ADDR_PARAMS,
	SCTP_PEER_ADDR_THLDS,
	SCTP_PEER_AUTH_CHUNKS,
	SCTP_PRIMARY_ADDR,
	SCTP_RTOINFO,
	SCTP_SET_PEER_PRIMARY_ADDR,
	SCTP_SOCKOPT_BINDX_ADD,
	SCTP_SOCKOPT_BINDX_REM,
	SCTP_SOCKOPT_CONNECTX,
	SCTP_SOCKOPT_CONNECTX3,
	SCTP_SOCKOPT_CONNECTX_OLD,
	SCTP_SOCKOPT_PEELOFF,
	SCTP_STATUS,
	SOL_SOCKET,
	SO_ACCEPTCONN,
	SO_ATTACH_FILTER,
	SO_BINDTODEVICE,
	SO_BROADCAST,
	SO_BSDCOMPAT,
	SO_BUSY_POLL,
	SO_CONACCESS,
	SO_CONDATA,
	SO_DEBUG,
	SO_DETACH_FILTER,
	SO_DOMAIN,
	SO_DONTROUTE,
	SO_ERROR,
	SO_GET_FILTER,
	SO_KEEPALIVE,
	SO_LINGER,
	SO_LINKINFO,
	SO_LOCK_FILTER,
	SO_MARK,
	SO_MAX_PACING_RATE,
	SO_NOFCS,
	SO_NO_CHECK,
	SO_OOBINLINE,
	SO_PASSCRED,
	SO_PASSSEC,
	SO_PEEK_OFF,
	SO_PEERCRED,
	SO_PEERNAME,
	SO_PEERSEC,
	SO_PRIORITY,
	SO_PROTOCOL,
	SO_PROXYUSR,
	SO_RCVBUF,
	SO_RCVBUFFORCE,
	SO_RCVLOWAT,
	SO_RCVTIMEO,
	SO_REUSEADDR,
	SO_REUSEPORT,
	SO_RXQ_OVFL,
	SO_SECURITY_AUTHENTICATION,
	SO_SECURITY_ENCRYPTION_NETWORK,
	SO_SECURITY_ENCRYPTION_TRANSPORT,
	SO_SELECT_ERR_QUEUE,
	SO_SNDBUF,
	SO_SNDBUFFORCE,
	SO_SNDLOWAT,
	SO_SNDTIMEO,
	SO_TIMESTAMP,
	SO_TIMESTAMPING,
	SO_TIMESTAMPNS,
	SO_TYPE,
	SO_WIFI_STATUS,
	TCP_CONGESTION,
	TCP_CORK,
	TCP_DEFER_ACCEPT,
	TCP_FASTOPEN,
	TCP_INFO,
	TCP_KEEPCNT,
	TCP_KEEPIDLE,
	TCP_KEEPINTVL,
	TCP_LINGER2,
	TCP_MAXSEG,
	TCP_MD5SIG,
	TCP_NODELAY,
	TCP_NOTSENT_LOWAT,
	TCP_QUEUE_SEQ,
	TCP_QUICKACK,
	TCP_REPAIR,
	TCP_REPAIR_OPTIONS,
	TCP_REPAIR_QUEUE,
	TCP_SYNCNT,
	TCP_THIN_DUPACK,
	TCP_THIN_LINEAR_TIMEOUTS,
	TCP_TIMESTAMP,
	TCP_USER_TIMEOUT,
	TCP_WINDOW_CLAMP,
	TIPC_CONN_TIMEOUT,
	TIPC_DEST_DROPPABLE,
	TIPC_IMPORTANCE,
	TIPC_NODE_RECVQ_DEPTH,
	TIPC_SOCK_RECVQ_DEPTH,
	TIPC_SRC_DROPPABLE,
	TUN_TX_TIMESTAMP,
	UDP_CORK,
	UDP_ENCAP,
	UTUN_OPT_EXT_IFDATA_STATS,
	UTUN_OPT_FLAGS,
	UTUN_OPT_IFNAME,
	UTUN_OPT_INC_IFDATA_STATS_IN,
	UTUN_OPT_INC_IFDATA_STATS_OUT,
	UTUN_OPT_SET_DELEGATE_INTERFACE,
}